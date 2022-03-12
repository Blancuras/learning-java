package com.enero27;

import java.util.Scanner;

public class VectorTres {

	public static void main(String[] args) {
		Scanner entrada1 = new Scanner(System.in);

		int[] numero = new int[8];
		int contador;
		System.out.print("Ingrese 8 numeros ");
		for (contador = 0; contador < 8; contador++) {
			numero[contador] = entrada1.nextInt();
			System.out.println(" Array Original");
		}
		entrada1.close();
		for (contador = 0; contador < 8; contador++) {
			System.out.printf(" | " + contador);
		}
		System.out.println("|");
		for (contador = 0; contador < 8; contador++) {
			System.out.print(" - ");
		}
		System.out.println(" - ");
		for (contador = 0; contador < 8; contador++) {
			System.out.printf(" | " + numero[contador]);
		}
		System.out.println(" | ");

		// Rotar de posicion
		int auxiliar = numero[7];
		for (contador = 7; contador > 0; contador--) {
			numero[contador] = numero[contador - 1];
		}
		numero[0] = auxiliar;

		// Array recorrido
		System.out.println("Array recorrido");
		for (contador = 0; contador < 8; contador++) {
			System.out.printf(" | " + contador);

			for (contador = 0; contador < 8; contador++) {
				System.out.printf(" | " + numero[contador]);
			}
			System.out.println(" | ");
		}
		
	}

}
