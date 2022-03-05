package com.sept29;

import java.util.Scanner;

public class Conversion {
	// Convertir metros a km a cm
	// 1km = 1000m
	// 1 metro = 100cm
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int metros;
		int km;
		int cm;

		System.out.println("Ingresa un valor en (metro)");
		metros = entrada.nextInt();
		km = metros / 1000;
		cm = metros * 100;
		System.out.println("En kilometros " + km);
		System.out.println("En centimetros " + cm);
	}
}
