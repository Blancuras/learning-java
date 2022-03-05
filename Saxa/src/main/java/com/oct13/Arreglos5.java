/*
 * Leer 5 numeros por teclado, almacenarlos en un arreglo y a continuacion realizar la media
 * de los numeros positivos, la media de los negtivos y contar el numero de ceros.
 */
package com.oct13;

import java.util.Scanner;

public class Arreglos5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float numeros[] = new float[5];
		float sumaPositivos = 0, sumaNegativos = 0, mediaPositivos, mediaNegativos;
		int conteoPositivos = 0, conteoNegativos = 0, conteoCeros = 0;

		System.out.println("Guardando los numeros en el arreglo son 5 numeros");
		for (int indice = 0; indice < 5; indice++) {
			System.out.println((indice + 1) + ". Digite un numero: ");
			numeros[indice] = entrada.nextFloat();

			if (numeros[indice] == 0) {
				conteoCeros++;
			} else if (numeros[indice] > 0) {
				sumaPositivos += numeros[indice];
				conteoPositivos++;
			} else {
				sumaNegativos += numeros[indice];
			}
		} 
		entrada.close();

		// media de los numeros positivos
		if (conteoPositivos == 0) {
			System.out.println("No se puede sacar la media de los numeros positivos por que no hay ninguno");
		} else {
			mediaPositivos = sumaPositivos / conteoPositivos;
			System.out.println("La media de los numeros positivos es: " + mediaPositivos);
		}

		// Media de los numeros negativos
		if (conteoNegativos == 0) {
			System.out.println("No se puede sacar la media de los numeros negativos");
		}else {
			mediaNegativos = sumaNegativos / conteoNegativos; 
			System.out.println("La media de los numeros negativos es: " + mediaNegativos);
		}
		System.out.println("La cantidad de ceros es: " + conteoCeros);
	}
}
