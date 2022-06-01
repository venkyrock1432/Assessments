package com.employee.CustomerDetails_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("customer.xml");
		Customer C = context.getBean("customer",Customer.class);
		Address A = C.getAddress();
		System.out.println(C.getCustomerName());
		System.out.println(C.getCustomerId());
		System.out.println(C.getCustomerContact());
		System.out.println(A);

	}

}
