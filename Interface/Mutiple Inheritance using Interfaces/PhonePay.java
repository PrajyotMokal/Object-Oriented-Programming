package com.jsp.Interface;

// Multiple Inheritance using Interfaces

public class PhonePay extends BalanceInquiry implements Payment, Transaction{
	
	public void makePayment() {
		System.out.println("Payment via PhonePay");
	}
	
	public void printTransaction() {
		System.out.println("Transaction via PhonePay");
	}
	
	public void checkBalance() {
		System.out.println("Balance check via PhonePay");
	}

}
