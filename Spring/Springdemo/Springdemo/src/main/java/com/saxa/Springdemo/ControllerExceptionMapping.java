package com.saxa.Springdemo;

import java.util.Objects;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.saxa.Springdemo.errores.GenericError;

@ControllerAdvice
public class ControllerExceptionMapping extends ResponseEntityExceptionHandler{
 
	@ExceptionHandler(value = {GenericError.class})
	protected ResponseEntity<Object> handleBusinessValidationException(GenericError ex, WebRequest request){
		return formatException(ex, null, HttpStatus.BAD_REQUEST,  request);
	}
 
	private ResponseEntity<Object> formatException(Exception ex, Object body,  HttpStatus status, WebRequest request){
		final String message = status.is5xxServerError() || Objects.isNull(body)? ex.getLocalizedMessage(): null;
		return handleExceptionInternal(ex, GenericResponseDTO.build(status, message, body), new HttpHeaders(),  status,  request);
	}
}
