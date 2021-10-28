package com.cybage.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cybage.exception.RecordNotFound;

@ControllerAdvice
public class AdviceController {

	@ExceptionHandler((RecordNotFound.class))
	@ResponseBody
	public ResponseEntity<String> handleException(RecordNotFound exception) {
		return new ResponseEntity<String>(exception.getMessage(),HttpStatus.NOT_FOUND) ;
	}
}
