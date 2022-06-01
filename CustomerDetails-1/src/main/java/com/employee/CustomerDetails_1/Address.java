package com.employee.CustomerDetails_1;

public class Address {
	private String street;
	private String city;
	private String state;
	private int zip;
	private String country;
	
	public Address() {
		
	}

	public Address(String street, String city, String state, int zip, String country) {
	
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + ", zip=" + zip + ", country="
				+ country + "]";
	}
	
	
	

}
