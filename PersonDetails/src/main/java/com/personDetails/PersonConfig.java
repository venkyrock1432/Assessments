package com.personDetails;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class PersonConfig {
	
	@Bean
	@Primary
	public Person personBean() {
		return new Person();
	}

}
