package com.bucles;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EdadLogiaTest {
	@Test
	public void prueba_calcular_edad_ok() {
		String esperado = "Tu edad es: 18";
		String resultado = EdadLogia.calcularEdad(18);
		assertEquals(esperado, resultado);
	}

	@Test
	public void prueba_calcularV2_edad_ok_peque() {
		String esperado = "peque";
		String resultado = EdadLogia.calcularEdadV2(16);
		assertEquals(esperado, resultado);
	}

	@Test
	public void prueba_calcularV2_edad_ok_adulto() {
		String esperado = "adulto";
		String resultado = EdadLogia.calcularEdadV2(30);
		assertEquals(esperado, resultado);
	} 
	
	@Test
	public void prueba_calcularV2_edad_ok_mayor() {
		String esperado = "mayor";
		String resultado = EdadLogia.calcularEdadV2(60);
		assertEquals(esperado, resultado);
	}
}
