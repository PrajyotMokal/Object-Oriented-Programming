package com.jsp.Abstraction;

public abstract class WhatsApp extends SocialMedia{
	
	@Override
	public void sendMessage() {
		System.out.println("Send msg is availabe in Version 1");
	}

	@Override
	public void receiveMessage() {
		System.out.println("Receive msg is availabe in Version 1");
	}
	
}
