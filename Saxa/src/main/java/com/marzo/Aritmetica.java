package com.marzo;

public class Aritmetica {

	int a;
	int b;

	public Aritmetica() {
		System.out.println("Ejecutando constructor vacio");
	}

	public Aritmetica(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Ejecutando constructor con dos argumentos");
	}

	public int sumar() {
		return a + b;
	}

	public int restar() {
		return a - b;
	}

	public int multiplicar() {
		return a * b;
	}

	public int dividir() {
		return a / b;
	}
}
