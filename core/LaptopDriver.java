package org.snad;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaptopDriver {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("laptop.xml");
		Laptop laptop = (Laptop) context.getBean("mylaptop");
		System.out.println(laptop);
		laptop.run();
	}

}
