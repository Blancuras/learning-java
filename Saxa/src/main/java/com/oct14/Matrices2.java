/*
 * Crear y cargar una matriz de tamaño 3x3, trasponerla y mostrarla
 */
package com.oct14;

import java.util.Scanner;

public class Matrices2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int matriz[][] = new int[3][3];

		System.out.println("Digite la matriz");
		for (int indice = 0; indice < 3; indice++) {
			for (int indice2 = 0; indice2 < 3; indice2++) {
				System.out.print("Matriz [" + indice + "][" + indice2 + "]: ");
				matriz[indice][indice2] = entrada.nextInt();
			}
		}
		entrada.close();
		System.out.println("\nMatriz original: ");
		for (int indice = 0; indice < 3; indice++) {
			for (int indice3 = 0; indice3 < 3; indice3++) {
				System.out.print(matriz[indice][indice3] + " ");
			}
			System.out.println("");
		}

		// transponiendo la matriz
		int auxiliar;
		for (int indice = 0; indice < 3; indice++) {
			
		}
		int indice = 0; // error
		for (int indice2 = 0; indice2 < indice; indice2++) {
			auxiliar = matriz[indice][indice2];
			matriz[indice][indice2] = matriz[indice2][indice];
			matriz[indice2][indice] = auxiliar;

		}

		System.out.println("\nLa matriz transpuesta es: ");
		for (int indice1 = 0; indice1 < 3; indice1++) {
			for (int indice2 = 0; indice2 < 3; indice2++) {
				System.out.print(matriz[indice1][indice2] + " ");
			}
			System.out.println("");

		}
	}
}
