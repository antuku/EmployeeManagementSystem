package com.ems.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID=1L;
	
	private String  errorName;

	private String errorMessage;
	
	private Object errorValue;
	
	public String getErrorName() {
		return errorName;
	}

	public void setErrorName(String errorName) {
		this.errorName = errorName;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Object getErrorValue() {
		return errorValue;
	}

	public void setErrorValue(Object errorValue) {
		this.errorValue = errorValue;
	}

	public ResourceNotFoundException(String errorName, String errorMessage, Object errorValue) {
		super();
		this.errorName = errorName;
		this.errorMessage = errorMessage;
		this.errorValue = errorValue;
	}	

}
