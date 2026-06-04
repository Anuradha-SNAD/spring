package org.snad;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingleTon {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("singleton.xml");
		Single single = (Single) context.getBean("single");
		System.out.println(single);
		
		Single single2 = (Single) context.getBean("single");
		System.out.println(single2);
		
		Single single3 = (Single) context.getBean("single");
		System.out.println(single3);//single ton same object bydefault scope is singleton
	
		System.out.println("=================================");
		Prototype p = (Prototype) context.getBean("proto");	
		System.out.println(p);
		
		Prototype p2 = (Prototype) context.getBean("proto");
		System.out.println(p2);
		
		Prototype p3 = (Prototype) context.getBean("proto");
		System.out.println(p3);
	
	}

}

