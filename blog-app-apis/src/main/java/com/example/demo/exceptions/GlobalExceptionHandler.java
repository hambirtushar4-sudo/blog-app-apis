package com.example.demo.exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.payloads.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> resourceNotFoundExceptionHandler(ResourceNotFoundException ex) {
		String message = ex.getMessage();
		ApiResponse apiResponse = new ApiResponse(message, false);
		return new ResponseEntity<>(apiResponse, HttpStatus.NOT_FOUND); // 404
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String, String>> HandleMethodArgumentNotValidException(
			MethodArgumentNotValidException ex) {
		Map<String, String> resp = new HashMap<>();

		ex.getBindingResult().getAllErrors().forEach((error) -> {
			String feildName = ((FieldError) error).getField();
			String message = error.getDefaultMessage();
			resp.put(feildName, message);

		});

		return new ResponseEntity<Map<String, String>>(resp, HttpStatus.BAD_REQUEST);

	}

	/*
	 * // 2. Handle Validation Errors
	 * 
	 * @ExceptionHandler(MethodArgumentNotValidException.class) public
	 * ResponseEntity<Map<String, String>>
	 * handleValidationException(MethodArgumentNotValidException ex) { Map<String,
	 * String> errors = new HashMap<>();
	 * 
	 * ex.getBindingResult().getAllErrors().forEach((error) -> { String fieldName =
	 * ((FieldError) error).getField(); String message = error.getDefaultMessage();
	 * errors.put(fieldName, message); });
	 * 
	 * return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST); }
	 */
}
