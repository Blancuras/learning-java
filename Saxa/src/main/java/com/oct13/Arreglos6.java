/*
 * Leer por teclado dos tablas de 10 numeros enteros y mezclarlas en una tercera de la forma: 
 * el 1 de B, el 1 de B, el 2 de A, el 2 de B, etc.
 */
package com.oct13;

import java.util.Scanner;

public class Arreglos6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int arreglo1[], arreglo2[], arreglo3[];

		arreglo1 = new int[10]; // Arreglo a con 10 elementos
		arreglo2 = new int[10]; // Arreglo b con 10 elementos
		arreglo3 = new int[20]; // Arreglo c contendra al arreglo a y b

		// Pedimos el arreglo a
		System.out.println("Digite el primer arreglo: ");
		for (int indice = 0; indice < 10; indice++) {
			System.out.print((indice + 1) + ". Digite un numero: ");
			arreglo1[indice] = entrada.nextInt();
		}

		// Pedimos el arreglo b
		System.out.println("\nDigite el segindo arreglo: ");
		for (int indice = 0; indice < 10; indice++) {
			System.out.print((indice + 1) + ". Digite un numero: ");
			arreglo2[indice] = entrada.nextInt();
		}
		entrada.close();

		// Mezclmos los 2 arreglos en el arreglo c
		// Utilizamos el iterador indice para a y b
		// y el iterador j para el arreglo c

		int j = 0;
		for (int indice = 0; indice < 10; indice++) {
			arreglo3[j] = arreglo1[indice]; // 1 A
			j++;
			arreglo3[j] = arreglo2[indice]; // 1 B, 2 B
			j++;
		}

		System.out.println("\nEl tercer arreglo es: ");
		for (int indice = 0; indice < 20; indice++) {
			System.out.print(arreglo3[indice] + " ");
		}
		System.out.println();
	}

}
