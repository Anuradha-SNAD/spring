package org.snad;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Course {
	String courseName;
	int fee;
	
	public Course(@Value("Java-Fullstack") String courseName,@Value("25000") int fee) {
		this.courseName = courseName;
		this.fee = fee;
	} 

	public void duration() {
		System.out.println("Course : "+courseName);
		System.out.println("Fee : "+fee);
		System.out.println("Life time...");
	}

	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", fee=" + fee + "]";
	}

}
