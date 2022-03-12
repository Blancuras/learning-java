package com.feb2;

public class Decimales {

	public static void main(String[] args) {
		double multiplicador = 0.0001f;
		double acumulador = 0;
		for (int x = 0; x<150; x++) {
			acumulador = acumulador +multiplicador;
			System.out.println("acumulador "+ acumulador);
		}
		
	}
}
