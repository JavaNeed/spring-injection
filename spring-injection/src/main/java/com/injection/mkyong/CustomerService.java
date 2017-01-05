package com.injection.mkyong;

public class CustomerService {
	String message;

	public CustomerService(){
		System.out.println("CustomerService constructor.....");
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
