package com.SpringCore.CustomerService;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class CustomerService implements InitializingBean,DisposableBean{
	@Value("Property value")
	private String message;
	
	

	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	public void afterPropertiesSet() throws Exception {
		
		System.out.println("Initializing Method after properties are set :"+ message);
		
	}



	public void destroy() throws Exception {
		System.out.println("Spring Container is destroy");
		
	}
}
	
