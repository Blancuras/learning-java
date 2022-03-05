/*
 * Desarrolar un programa que permita cargar 5 nombre de personas y sus respectivas
 * edades.Luego de realizar la carga por teclado de todos los datos, imprimir los 
 * nombres de las personas mayores de edad(mayores o iguales a 18 anios)
 */
package feb11;

import java.util.Scanner;

public class NombrePersona {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String[] personas = new String[5];
		int edades[] = new int[5];

		// Llenamos los arreglos
		for (int indice = 0; indice < personas.length; indice++) {
			System.out.print("Digite el nombre de una persona: ");
			personas[indice] = entrada.next();

			System.out.print("");

			System.out.print("Digite la edad de la persona: ");
			edades[indice] = entrada.nextInt();

		}

		// Imprmimos las peronas mayores de edad
		System.out.println("\nLas personas mayores de edad son : ");
		for (int iterador = 0; iterador < personas.length; iterador++) {
			if (edades[iterador] >= 18) {
				System.out.println(personas[iterador]);
			}

		}
	}

}
