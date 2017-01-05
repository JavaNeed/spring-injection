package com.injection.testing;

public abstract class RequestProcessor {
	private RequestValidator validator;
	
	protected abstract RequestValidator createValidator();
	
	public RequestProcessor(){
		System.out.println("Constructor:: RequestProcessor instance created!");
	}
	
	public void handleRequest(String requestId){
		System.out.println("Request ID : "+ requestId);
		RequestValidator validator = createValidator(); //here Spring will create new instance of prototype bean
        validator.validate(requestId);
    }
 
    public RequestValidator getValidator() {
        return validator;
    }
 
    public void setValidator(RequestValidator validator) {
        this.validator= validator;
    }
    
    
}
