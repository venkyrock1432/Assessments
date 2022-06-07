package com.SpringCore.CustomerService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class CustomerServiceConfig {
	@Bean
	public CustomerService customerService() {
		return new CustomerService();
	}

}
