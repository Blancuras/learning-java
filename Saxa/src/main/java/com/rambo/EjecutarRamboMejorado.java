package com.rambo;

public class EjecutarRamboMejorado {

	public static void main(String[] args) {
		RamboMejorado blancuras = new RamboMejorado(); //creando instancia eliseo de rambo
		blancuras.setNombre("blancuras");// asignando nombre
		blancuras.dispararBalas();
		RamboMejorado eliseo = new RamboMejorado(); //creando instancia eliseo de rambo
		eliseo.setNombre("Eliseo");// asignando nombre
		
		eliseo.dispararBalas();
		RamboMejorado.dispararBalasEstaticas();//llamando metodo estatico de la clase directamente
		eliseo.dispararBalas();
		RamboMejorado.dispararBalasEstaticas();
		eliseo.dispararBalas(); 
		blancuras.dispararBalas();
		
		RamboMejorado aileen = new RamboMejorado(); 
		aileen.setNombre("Aileen");
		aileen.dispararBalas();
		RamboMejorado.dispararBalasEstaticas();
		aileen.dispararBalas();
		RamboMejorado.dispararBalasEstaticas();
		blancuras.dispararBalas();
	}

}
