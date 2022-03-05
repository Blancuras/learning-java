package com.bucles;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Calcu2Test {

	@Test 
	public void prueba_multiplicar_resultado_ok() {
		int esperado = 10; 
		int resultado = Calcu2.multiplicacion(5, 2); 
		assertEquals(esperado, resultado);
	}
	
}
