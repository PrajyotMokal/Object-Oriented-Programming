package com.jsp.Abstraction;

public class SocialMediaDriver {
	public static void main(String[] args) {
		
		WhatsApp2 w = new WhatsApp2();
		
		w.sendMessage();
		w.receiveMessage();
		w.uploadPhoto();
		
	}

}
