package com.jsp.Interface;

public class PaymentDriver {
	public static void main(String[] args) {
		
		PhonePay pay = new PhonePay();
		
		pay.makePayment();
		pay.cancelPayment();
		pay.checkBalance();
		pay.printTransaction();
		
	}

}
