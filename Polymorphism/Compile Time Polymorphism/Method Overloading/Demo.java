package com.jsp.Polymorphism;

public class Demo {
		
		// Method Overloading
		
		public void sum(int a, int b) {
			System.out.println(a+b);
		}
		
		
		public void sum(int a, int b, int c) {
			System.out.println(a+b+c);
		}
		
		
		
		public static void main(String[] args) {
			Demo d = new Demo();
				d.sum(35, 45); 
				d.sum(10, 40, 50);
		}

}
