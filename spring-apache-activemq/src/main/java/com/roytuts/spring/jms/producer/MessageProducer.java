package com.roytuts.spring.jms.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;

public class MessageProducer {

	@Autowired
	private JmsTemplate jmsTemplate;

	public void sendMessageToDefaultDestination(final String message) {
		jmsTemplate.convertAndSend(message);
	}

}