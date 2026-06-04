package org.snad;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileDriver {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("mobile.xml");
		Mobile mobile = (Mobile) context.getBean("mymobile");
		System.out.println("Brand : "+mobile.getBrand());
		System.out.println("ram : "+mobile.getRam());
		System.out.println("price : "+mobile.getCost());
		
	}

}
