package com.jsp.Encapsulation;

public class MobileSimDriver {
	public static void main(String args[]) {
		
		Mobile m = new Mobile("Vivo","8GB","Black", 24000.0);
		m.printMobileDetails();  

		m.setS1(new Sim1("Airtel","5G", 898786453));  
		m.setS2(new Sim2("Jio","4G", 985653437));
		m.printMobileDetails();
				
	}

}