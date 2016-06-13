package com.java.jms.message.listener;

import java.net.URI;
import java.net.URISyntaxException;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.broker.BrokerFactory;
import org.apache.activemq.broker.BrokerService;

public class JmsMessageListenerAckExample {
	public static void main(String[] args) throws URISyntaxException, Exception {
		BrokerService broker = BrokerFactory.createBroker(new URI(
				"broker:(tcp://localhost:61616)"));
		broker.start();
		Connection connection = null;
		try {
			// Producer
			ConnectionFactory factory = new ActiveMQConnectionFactory(
					"vm://localhost?broker.persistent=false&marshal=true");
			connection = factory.createConnection();
			Session session = connection.createSession(false,
					Session.CLIENT_ACKNOWLEDGE);
			Queue queue = session.createQueue("customerQueue");
			String payload = "Important Task";
			Message msg = session.createTextMessage(payload);
			MessageProducer producer = session.createProducer(queue);

			System.out.println("Sending text '" + payload + "'");
			producer.send(msg);
			
			// Consumer
			MessageConsumer consumer = session.createConsumer(queue);
			consumer.setMessageListener(
					new AckMessageListener(false));
			connection.start();		
			
			Thread.sleep(1000);
			
			System.out.println("Change the message listener to acknowledge");
			System.out.println("Sending text '" + payload + "'");
			producer.send(msg);
			consumer.setMessageListener(
					new AckMessageListener(true));
			
			Thread.sleep(1000);
			session.close();
		} finally {
			if (connection != null) {
				connection.close();
			}
			broker.stop();
		}
	}

}
