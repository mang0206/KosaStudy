package day07;

import java.io.Serializable;

public class Student2 implements Serializable {
	String name;
	int age;
	String subject;
	
	public Student2() {
		
	}
	public Student2(String name, int age, String subject) {
		this.name= name;
		this.age =age;
		this.subject = subject;
	}
	void study() {
		
	}
	
	public String getStudentInfo() {
		return name + age + subject;
	}
}