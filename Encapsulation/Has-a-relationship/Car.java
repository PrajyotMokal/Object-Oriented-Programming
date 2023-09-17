package com.jsp.Encapsulation;

public class Car {
		private String brand;
		private String name;
		private String color;
		private double price;
		
	 // Has-a-relationship
		private Engine e1;
	
		public Car(String b, String n, String c, double p) {
			this.brand=b;
			this.name=n;
			this.color=c;
			this.price=p;
		}
		
		
	 // getters & setters

		public String getBrand() {
			return brand;
		}
	
		public void setBrand(String brand) {
			this.brand = brand;
		}
	
		public String getName() {
			return name;
		}
	
		public void setName(String name) {
			this.name = name;
		}
	
		public String getColor() {
			return color;
		}
	
		public void setColor(String color) {
			this.color = color;
		}
	
		public double getPrice() {
			return price;
		}
	
		public void setPrice(double price) {
			this.price = price;
		}
	
		public Engine getE1() {
			return e1;
		}
	
		public void setE1(Engine e1) {
			this.e1 = e1;
		}
		
		
		public void printCarDetails() {
			System.out.println("=====Car=====");
			System.out.println(brand);
			System.out.println(name);
			System.out.println(color);
			System.out.println(price);
			
			if(e1 != null) {
				e1.printEngine();
			}
			else {
				System.out.println("Engine is not present");
			}
				
		}

}