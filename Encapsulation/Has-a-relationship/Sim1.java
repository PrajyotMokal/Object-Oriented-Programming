package com.jsp.Encapsulation;

public class Sim1 {
		private String service_provider;
		private String type;
		private long cno;
		
		public Sim1(String sp, String type, long cno) {
			this.service_provider=sp;
			this.type=type;
			this.cno=cno;
		}
	
		// getters & setters
		
		public String getService_provider() {
			return service_provider;
		}
	
		public void setService_provider(String service_provider) {
			this.service_provider = service_provider;
		}
	
		public String getType() {
			return type;
		}
	
		public void setType(String type) {
			this.type = type;
		}
	
		public long getCno() {
			return cno;
		}
	
		public void setCno(long cno) {
			this.cno = cno;
		}
	
		public void printSim1() {
			System.out.println("=======SIM1=======");
			System.out.println(service_provider);
			System.out.println(type);
			System.out.println(cno);
			
		}
	
}