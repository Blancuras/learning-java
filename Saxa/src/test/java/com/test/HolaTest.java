package com.test;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.bucles.Calcu1;

public class HolaTest {

	@Test
	public void prueba_suma_valida() {
		int resultado = 20;
		assertEquals(resultado, 10 + 10);
	}

	@Test
	public void prueba_resta_valida() {
		int resultado = 0;
		assertEquals(resultado, 10 - 10);
	}

	// Prueba calcu1
	@Test
	public void prueba_suma_resultado_ok() {
		int esperado = 20;
		int resultado = Calcu1.suma(10, 10);
		assertEquals(esperado, resultado);
	}

	@Test 
	public void prueba_resta_resultado_ok() {
		int esperado = 30; 
		int resultado = Calcu1.resta(50, 20); 
		assertEquals(esperado, resultado);
	}
}
