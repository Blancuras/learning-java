package com.saxa.springdemo.marzo24.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ArchivoService {

	@Qualifier("archivo1")
	private String archivo;
}
