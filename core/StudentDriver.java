package org.snad;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDriver {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext( "myapplicationproperty.xml");
		Student student = context.getBean(Student.class);
		System.out.println(student);
		student.study();
		StudentService service = context.getBean(StudentService.class);
		service.registerStudent();
	}

}
