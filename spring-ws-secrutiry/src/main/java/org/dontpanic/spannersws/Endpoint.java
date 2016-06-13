package org.dontpanic.spannersws;

import org.jdom.Namespace;
import org.springframework.ws.server.endpoint.AbstractJDomPayloadEndpoint;
import org.jdom.Element;
import org.jdom.xpath.XPath;

public class Endpoint extends AbstractJDomPayloadEndpoint {

    private static final Namespace NS = Namespace.getNamespace("ws", "http://dontpanic.org/ws/spannersws");

    public Element invokeInternal(Element message) throws Exception {

        // Obtain the spanner id from the message
        XPath xpath = XPath.newInstance("//ws:id");
        xpath.addNamespace(NS);
        String id = xpath.valueOf(message);

        // TODO Do some work. Request to retrieve spanner would go here.

        // Assemble response
        Element response = new Element("GetSpannerResponse", NS);
        response.addContent(new Element("id", NS).setText(id));
        response.addContent(new Element("name", NS).setText("Spanner " + id));
        response.addContent(new Element("size", NS).setText("42"));
        return response;
    }

}
