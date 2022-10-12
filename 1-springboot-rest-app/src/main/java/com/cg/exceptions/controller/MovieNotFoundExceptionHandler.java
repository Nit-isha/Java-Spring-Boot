package com.cg.exceptions.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.cg.dto.APIError;
import com.cg.exception.MovieNotFoundException;


//Global exception handler ......
@RestControllerAdvice//act as catch block

public class MovieNotFoundExceptionHandler {
	
	@ExceptionHandler(MovieNotFoundException.class)
	public ResponseEntity<APIError> handler(Exception e) {
		
		APIError error= new APIError(e.getMessage(),404);
	
		return new ResponseEntity<APIError>(error, HttpStatus.NOT_FOUND);
	}
}