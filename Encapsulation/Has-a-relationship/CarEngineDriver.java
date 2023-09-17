package com.jsp.Encapsulation;

public class CarEngineDriver {
	public static void main(String[] args) {
		
		Car c1 = new Car("BMW", "X1", "Black", 6500000.0);
		c1.printCarDetails();
		
		c1.setE1(new Engine ("MS", "25000 cc"));
		c1.printCarDetails();
		
	}

}