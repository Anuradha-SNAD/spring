package org.snad;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryBook {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("librarybook.xml");
		Library library = (Library) context.getBean("mylibary");
		System.out.println(library);
		System.out.println(library.getBooks());
	}

}
