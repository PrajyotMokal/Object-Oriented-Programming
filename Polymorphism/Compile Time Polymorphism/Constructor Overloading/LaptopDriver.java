package com.jsp.Polymorphism;

public class LaptopDriver {
	public static void main(String[] args) {
		
		Laptop L1 = new Laptop();
		Laptop L2 = new Laptop("DELL", "8GB");
		Laptop L3 = new Laptop("HP", "16GB", 45000.0);
		
		System.out.println(L1.brand);
		System.out.println("==========");
		
		System.out.println(L2.brand);
		System.out.println(L2.ram);
		System.out.println("==========");

		System.out.println(L3.brand);
		System.out.println(L3.ram);
		System.out.println(L3.price);
		System.out.println("==========");
	}
}
