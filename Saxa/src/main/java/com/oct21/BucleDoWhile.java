package com.oct21;

import java.util.Scanner;

public class BucleDoWhile {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valor;
		do {
			System.out.println("Introduce un valor entre 0 y 999 (0 finalizar):");
			valor = teclado.nextInt();
			if (valor >= 100) {
				System.out.println("Contiene tres numeros.");
			} else {
				System.out.println("Contiene un numero.");
			}
		} while (valor != 0);
		teclado.close();
	}

}
