package com.oct13;

public class Recursion {

	public static void main(String[] args) {
		factorial(0, 5); 
		concatenacion("", 10);
	}

	private static void factorial(int total, int indice) {
		if (indice == 0) {
			System.out.println("el total es: " + total);
		} else {
			System.out.println("el total es: " + total);
			total += indice;
			indice--;
			factorial(total, indice);
		}
	}

	private static void concatenacion(String acumulador, int indice) {
		if (indice == 0) {
			System.out.println(acumulador);
		} else {
			acumulador += " - " + indice; 
			indice--; 
			concatenacion(acumulador, indice);
		}
	}
}
