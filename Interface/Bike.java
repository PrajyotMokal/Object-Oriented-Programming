package com.jsp.Interface;

public class Bike implements Vehicle{

		@Override
		public void speedUp() {
			System.out.println("Increase the speed");
		}
		
		
		@Override
		public void applyBrake() {
			System.out.println("Apply brake where required");
		}
	
}