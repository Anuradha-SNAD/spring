package org.snad;

public class Employee {
	
	Employee(){
		System.out.println("Constructor Called");
	}
	public void init() {
        System.out.println("Bean Initialization Method ");
    }

    public void destroy() {
        System.out.println("Bean Destroy Method ");
    }

    public void work() {
        System.out.println("Employee Working...");
    }

}
