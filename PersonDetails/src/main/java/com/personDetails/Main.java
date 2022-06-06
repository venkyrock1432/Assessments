package com.personDetails;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;




public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(PersonConfig.class);
		
		Person p = context.getBean(Person.class);
		
	    System.out.println(p.getName());
		
		System.out.println(p.getPhoneNumber());
		
		System.out.println(p.getOccupation());
		

	}

}
