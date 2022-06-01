package com.employee.CustomerDetails;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("customer.xml");
		Customer C = context.getBean("customer",Customer.class);
		Address temp = C.getAddress();
		System.out.println("CustomerName :"+C.getCustomerName()+"\nId :"+C.getCustomerId()+"\nMobileNumber :"+C.getCustomerContact());
		System.out.println(temp.getStreet()+"\n"+temp.getState()+"\n"+temp.getCity()+"\n"+temp.getCountry()
		+"\n"+temp.getZip());
		
		
		

	}

}
