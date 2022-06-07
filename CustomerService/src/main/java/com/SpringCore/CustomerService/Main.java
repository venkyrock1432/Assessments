package com.SpringCore.CustomerService;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(CustomerServiceConfig.class);
		
		CustomerService c = context.getBean(CustomerService.class);
		
		System.out.println(c);
		
		context.close();
		

	}

}
