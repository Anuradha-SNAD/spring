package org.snad;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeDriver {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("emp.xml");
		Employee employee = (Employee)context.getBean("myemp");
		employee.work();
		context.close();
	}

}
