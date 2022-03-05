package com.oct1;

import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] numero = new int[8];
		int contador;
		System.out.println("Ingresa 8 numeros");
		for (contador = 0; contador < 8; contador++) {
			numero[contador] = entrada.nextInt();
		}
		System.out.println(" Array original ");

		for (contador = 0; contador < 8; contador++) {
			System.out.printf(" | " + contador);
		}
		System.out.println(" | ");
		for (contador = 0; contador < 10; contador++) {
			System.out.print(" - ");
		}
		System.out.println(" - ");
		for (contador = 0; contador < 8; contador++) {
			System.out.printf(" | " + numero[contador]);
		}
		System.out.println(" | ");
	}

}
