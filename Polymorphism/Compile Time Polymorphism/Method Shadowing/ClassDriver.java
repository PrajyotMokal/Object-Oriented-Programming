package com.jsp.Polymorphism;

public class ClassDriver {
	public static void main(String[] args) {
		
		Teacher t = new Student();
		t.m2();						//  --> Method Overriding	
		t.m1();						//  --> Method Shadowing
		
		
		Student s = new Student();
		s.m2();						//  --> Method Overriding
		s.m1();						//  --> Method Shadowing
				
	}

}