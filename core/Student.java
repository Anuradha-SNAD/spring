package org.snad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Student {
	@Value("Anu")
	String name;
	@Value("22")
	int age;
	@Value("90")//it will re-initialize
	int marks;
	@Autowired
	Course course;
	
	public Student(@Value("Anuradha") String name,@Value("21") int age,@Value("62") int marks) {
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	
	public void study() {
		System.out.println("Studying...");
		course.duration();
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}

}
