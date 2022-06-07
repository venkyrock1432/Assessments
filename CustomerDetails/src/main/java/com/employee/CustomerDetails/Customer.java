package com.employee.CustomerDetails;

public class Customer {
	private int CustomerId;
	private String CustomerName;
	private long CustomerContact;
	private Address address;
	
	//created a setter and getter for customer class
	
	public int getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public long getCustomerContact() {
		return CustomerContact;
	}
	public void setCustomerContact(long customerContact) {
		CustomerContact = customerContact;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
