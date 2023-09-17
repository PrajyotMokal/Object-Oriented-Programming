package com.jsp.Polymorphism;

public class Test {
	
	int id = 25;
	String name = "ABC";
	
	
	public static void main(String[] args) {
		
		// Variable Shadowing
		
		int id = 26;
		String name = "XYZ";
		
		System.out.println(id);
		System.out.println(name);
		
	}

}
