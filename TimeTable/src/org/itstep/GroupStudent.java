package org.itstep;

import java.util.ArrayList;

public class GroupStudent {

	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	private ArrayList<Student> students = new ArrayList<>(); 
	
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void addStudentToGroup(Student student){
		students.add(student);
	}
}
