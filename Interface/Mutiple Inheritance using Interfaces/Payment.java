package com.jsp.Interface;

public interface Payment {
	
	void makePayment();
		
	default void cancelPayment() {
		System.out.println("Transaction Failed");
	}

}
