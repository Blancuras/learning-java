package com.oct12;

/*
 * Diseñar un programa que muestre la multipicacion de los numeros impares.
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		long multiplicacion = 1;

		for (int indice = 1; indice <= 20; indice += 2) {
			multiplicacion = multiplicacion * indice;
		} 
		System.out.println("El producto es: " + multiplicacion);
	}

}
