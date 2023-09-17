package com.jsp.Encapsulation;

public class Engine {
		private String brand;
		private String cubic_capacity;
		
		
		public Engine(String brand, String cc) {
			this.brand=brand;
			this.cubic_capacity=cc;
		}
		
		
		// getters & setters
		
		public void setBrand(String brand) {
			if(brand==null) 
			{
				System.out.println("Null is not allowed");	
				
			} else {
				this.brand=brand;			
			}
		}
		
		public String getBrand() {
			return brand;
		}
		
		
				
		public void setCubic_Capacity(String cc) {
			this.cubic_capacity=cc;
		}
		
		public String getCubic_Capacity() {
			return cubic_capacity;
		}
		
		
		public void printEngine() {
			System.out.println("=====Engine=====");
			System.out.println(brand);
			System.out.println(cubic_capacity);
			System.out.println("================");
		}
		

}