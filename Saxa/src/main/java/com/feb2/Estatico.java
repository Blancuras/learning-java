package com.feb2;

public class Estatico {
	private static String frase = "Primera frase"; // atributo estatico

	public static int sumar(int num1, int num2) { // metodo estatico
		return num1 + num2;
	}

	public static void main(String[] args) {
		System.out.println(Estatico.frase);
		System.out.println("La suma es: " + Estatico.sumar(3, 4));
	}

}
