package com.saxa.Springdemo.marzo24.configuracion;

import org.springframework.context.annotation.Bean;

public class ArchivoConfig {

	@Bean(name = "archivo1")
	public String archivo1() {
		return "c:/archivo.txt";
	}
	
	@Bean(name = "archivo2")
	public String archivo2() {
		return "c:/archivo.txt";
	}
}
