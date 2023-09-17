package com.jsp.Encapsulation;

public class Mobile {
		private String brand;
		private String ram;
		private String color;
		private double price;
	
	 // Has-a-relationship
		private Sim1 s1;
		private Sim2 s2;
	
		
		public Mobile(String brand,String ram, String color, double price) {
			this.brand=brand;
			this.ram=ram;
			this.color=color;
			this.price=price;
		}
	
		
	 // getters & setters
	
		public String getBrand() {
			return brand;
		}
	
		public void setBrand(String brand) {
		this.brand = brand;
		}
	
		public String getRam() {
		return ram;
		}
	
		public void setRam(String ram) {
			this.ram = ram;
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
	
		public Sim1 getS1() {
			return s1;
		}
	
		public void setS1(Sim1 s1) {
			this.s1 = s1;
		}
	
		public Sim2 getS2() {
			return s2;
		}
	
		public void setS2(Sim2 s2) {
			this.s2 = s2;
		}
	
		public void printMobileDetails() {
			System.out.println("======MOBILE======");
			System.out.println(brand);
			System.out.println(ram);
			System.out.println(color);
			System.out.println(price);
	
			if(s1!=null&&s2!=null) {
				s1.printSim1();
				s2.printSim2();
			}
			else {
				System.out.println("Sim is not present");
			}
		}
}	