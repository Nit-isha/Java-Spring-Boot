package com.cg.exceptions.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cg.dto.APIError;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(Exception.class)
	public ResponseEntity<APIError> handler(Exception e) {
		APIError error= new APIError(e.getMessage(),404);
		return new ResponseEntity<APIError>(error, HttpStatus.NOT_FOUND);
	}
}