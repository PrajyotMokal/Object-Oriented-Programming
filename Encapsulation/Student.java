package com.jsp.Encapsulation;

public class Student {
		private int id;
		private String name;
		private String email;
		private long cno;
		
		
		// getters & setters
	
		public void setID(int id) {
			if (id>0) {
				this.id=id;
			}else {
				System.out.println("Enter a valid id");
			}
		}
		
		public int getId() {
			return id;
		}
		
		public void setName(String name) {
			this.name=name;
		}
		
		public String getName() {
			return name;
		}
		
		public void setEmail(String email) {
			this.email=email;
		}
		
		public String getEmail() {
			return email;
		}
		
		public void setCno(long cno) {
			this.cno=cno;
		}
		
		public long getCno() {
			return cno;
		}
}