package com.saxa.springdemo.errores;

public class GenericError extends RuntimeException {
 
	private static final long serialVersionUID = 3594060642625219852L;

	public GenericError(String message) {
		super(message);
	}
}
