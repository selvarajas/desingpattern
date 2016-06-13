package com.java.jms.message.listener;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

public class AckMessageListener implements MessageListener {
	private boolean acknowledge;

	public AckMessageListener(boolean acknowledge) {
		this.acknowledge = acknowledge;
	}

	public void onMessage(Message message) {
		if (acknowledge) {
			try {
				message.acknowledge();
			} catch (JMSException e1) {
				e1.printStackTrace();
			}
		}
		System.out.println(message);
	}
}
