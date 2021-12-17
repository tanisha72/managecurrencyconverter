package com.ibm.advice;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ibm.exception.CurrencyNotFoundException;
import com.ibm.model.ErrorResponse;

@RestControllerAdvice
public class ManageCurrencyFactorControllerAdvice {

	@ExceptionHandler(CurrencyNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleCurrencyNotFoundException(CurrencyNotFoundException e)
	{
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ErrorResponse("10404","Currency Not Found",new Date()));
	}
}
