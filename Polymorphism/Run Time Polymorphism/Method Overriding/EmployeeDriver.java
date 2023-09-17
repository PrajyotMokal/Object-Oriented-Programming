package com.jsp.Polymorphism;

public class EmployeeDriver {
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1024, "ABC", "abc@gmail.com");
		Employee e2 = new Employee(1024, "XYZ", "abc@gmail.com");
		
		
		// toString()
		System.out.println(e1);				
			
		
		// equals(Object obj)
		System.out.println(e1.equals(e2));	
		
		
		// hashCode()
		System.out.println(e1.hashCode());		
		System.out.println(e2.hashCode());
		
	}

}