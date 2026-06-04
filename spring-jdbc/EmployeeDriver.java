package org.snad;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeDriver {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("myapplicationproperty.xml");
		EmployeeService service = context.getBean(EmployeeService.class);
		
		Employee emp = new Employee(101, "Vara", 34000);
//		service.addEmployee(emp);
//		service.removeEmployee(104);
//		service.updateEmployeeSalary(101, 99999);
		Employee employ = service.fetch(101);
		System.out.println(employ);
		//fetchAll
//		List<Employee> employees =service.fetchAll();
//
//		for(Employee e : employees) {
//		    System.out.println(e);
//		}
	}

}
