package org.itstep;

public class Student extends User {
	
	public Student(){

	}
	public Student(String login, String pass, String name, String city){
		 this.setCity(city);
		 this.setLogin(login);
		 this.setName(name);
		 this.setPass(pass);

	}
}
