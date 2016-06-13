/*
 * Copyright 2007-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springbyexample.ws.embedded;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.servlet.ServletContext;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mortbay.jetty.Handler;
import org.mortbay.jetty.Server;
import org.mortbay.jetty.servlet.Context;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springbyexample.person.schema.beans.GetPersonsRequest;
import org.springbyexample.person.schema.beans.Person;
import org.springbyexample.person.schema.beans.PersonResponse;
import org.springbyexample.ws.client.PersonServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

/**
 * Tests person service client against an embedded web service 
 * with the main Spring context as the parent context.
 * 
 * @author David Winterfeldt
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class EmbeddedPersonServiceClientTest {

    final static Logger logger = LoggerFactory.getLogger(EmbeddedPersonServiceClientTest.class);
    
    protected final static Integer ID = new Integer(1);
    protected final static String FIRST_NAME = "Joe";
    protected final static String LAST_NAME = "Smith";

    protected final static Integer SECOND_ID = new Integer(2);
    protected final static String SECOND_FIRST_NAME = "John";
    protected final static String SECOND_LAST_NAME = "Jackson";

    @Autowired
    protected PersonServiceClient client = null;
    
    /**
     * Start Web Services in an embedded Jetty instance 
     * with the main configuration context as the parent 
     * of the embedded Web Service context. 
     */
    @BeforeClass
    public static void init() throws Exception {
        AbstractApplicationContext ctx = 
            new ClassPathXmlApplicationContext("/org/springbyexample/ws/embedded/embedded-jetty-context.xml");
        ctx.registerShutdownHook();
        
        Server server = (Server) ctx.getBean("jettyServer");
        
        ServletContext servletContext = null;
        
        for (Handler handler : server.getHandlers()) {
            if (handler instanceof Context) {
                Context context = (Context) handler;

                servletContext = context.getServletContext();
            }
        }

        XmlWebApplicationContext wctx = new XmlWebApplicationContext();
        wctx.setParent(ctx);
        wctx.setConfigLocation("");
        wctx.setServletContext(servletContext);
        wctx.refresh();
        
        servletContext.setAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE, wctx);

        server.start();
        
        logger.info("Server started.");
    }
    
    /**
     * Tests person service client.
     */ 
    @Test
    @DirtiesContext
    public void testPersonServiceClient() {
        assertNotNull("Client is null.", client);
        
        PersonResponse response = client.getPersons(new GetPersonsRequest());
        
        logger.debug("Received response from server.");
        
        assertNotNull("Response is null.", response);
        
        int expectedSize = 2;
        assertEquals("Expected person list to be a size of '" + expectedSize + "'.", expectedSize, response.getPerson().size());
      
        Person person = response.getPerson().get(0);
      
        assertNotNull("Person is null.", person);
      
        assertEquals("Expected id of '" + ID + "'.", ID.intValue(), person.getId());
        assertEquals("Expected first name of '" + FIRST_NAME + "'.", FIRST_NAME, person.getFirstName());
        assertEquals("Expected last name of '" + LAST_NAME + "'.", LAST_NAME, person.getLastName());
    
        Person person2 = response.getPerson().get(1);
      
        assertNotNull("Person is null.", person2);
      
        assertEquals("Expected id of '" + SECOND_ID + "'.", SECOND_ID.intValue(), person2.getId());
        assertEquals("Expected first name of '" + SECOND_FIRST_NAME + "'.", SECOND_FIRST_NAME, person2.getFirstName());
        assertEquals("Expected last name of '" + SECOND_LAST_NAME + "'.", SECOND_LAST_NAME, person2.getLastName());
        
        logger.debug("person1=[" +
                     "id=" + person.getId() + 
                     "  firstName=" + person.getFirstName() + 
                     "  lastName=" + person.getLastName() + 
                     "]," +
                     "person2=[" +
                     "id=" + person2.getId() + 
                     "  firstName=" + person2.getFirstName() + 
                     "  lastName=" + person2.getLastName() + 
                     "]");
    }
    
}
