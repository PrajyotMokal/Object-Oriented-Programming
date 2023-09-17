package com.jsp.Encapsulation;

public class StudentDriver {
	public static void main(String[]args) {
		Student student = new Student();
		
		student.setID(64);
		student.setName("XYZ");
		student.setEmail("xyz@gmail.com");
		student.setCno(578756533);
		
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getEmail());
		System.out.println(student.getCno());
				
	}

}