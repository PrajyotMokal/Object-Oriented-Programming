package com.jsp.Polymorphism;

import java.util.Objects;

public class Employee {
	
		int id;
		String name;
		String email;
		
		public Employee(int id, String name, String email) {
			this.id = id;
			this.name = name;
			this.email = email;
		}
	
		@Override
		public String toString() {
			return id + " is Emp ID   " + name + " is name   " + email + " is email" ;
		}

		
		@Override
		public boolean equals(Object obj) {
			Employee e = (Employee) obj;
			if (this.id == e.id && this.name == e.name && this.email == e.email) 
			{
				return true;
			}
			else {
				return false;
			}
		}
		
		
		@Override
		public int hashCode()
		{
			return Objects.hash(id, name, email);
		}
}
