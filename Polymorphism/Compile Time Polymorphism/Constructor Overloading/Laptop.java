package com.jsp.Polymorphism;

public class Laptop {
			
		String brand;
		String ram;
		String processor;
		double price;
		
		
		// Constructor Overloading
		   
		   public Laptop(){
			   System.out.println("No argument");
		   }
		   
		   public Laptop(String brand, double price) {
			   
		   }

		   public Laptop(double price, String brand) {
			   
		   }
		   
		   public Laptop(String brand, String ram) {
			   this.brand = brand;
			   this.ram = ram;
		   }
		   
		   public Laptop(String brand, String ram, double price) {
			   this.brand = brand;
			   this.ram = ram;
			   this.price = price;
		   }


}