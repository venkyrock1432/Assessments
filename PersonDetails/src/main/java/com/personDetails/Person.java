package com.personDetails;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;

@Component
public class Person {
	
	@Value("Venkatareddy")
	private String name;
	
	@Value("9493830482")
	private String phoneNumber;
	
	@Value("B.tech")
	private String qualification;
	
	@Value("Software Engineer")
	private String occupation;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
	
}
