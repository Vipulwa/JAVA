package com.cybage.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


public class RecordNotFound extends RuntimeException{

	public RecordNotFound(String msg) {		
		super(msg);
	}
	
}
