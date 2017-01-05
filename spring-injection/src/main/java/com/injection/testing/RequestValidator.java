package com.injection.testing;


import java.util.ArrayList;
import java.util.List;

public class RequestValidator {
	private List<String> errorMessages = new ArrayList<String>();
	
	public RequestValidator() {
        System.out.println("Constructor:: RequestValidator instance created!");
    }
	
	// Validates the request and populates error messages
    public void validate(String requestId){
    	System.out.println("RequestValidator :"+requestId);
    }
 
    public List<String> getErrorMessages() {
        return errorMessages;
    }
}
