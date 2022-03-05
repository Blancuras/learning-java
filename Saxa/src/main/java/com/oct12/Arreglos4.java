/*
 * Leer 5 numeros, guardarlos en un arreglo y mostrarlos en el mismo oreden introducido.
 */
package com.oct12;

import java.util.Scanner;

public class Arreglos4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float[] numeros = new float[5]; 
		System.out.println("Guardando los datos en el arreglo pon 5 numeros"); 
		for(int indice = 0; indice <5; indice++) {
			System.out.print((indice +1) + ". Digite un numero: "); 
			numeros[indice] = entrada.nextFloat(); 
		} 
		entrada.close();
		System.out.println("\nImprimir los elementos del arreglo"); 
		for(float indice: numeros) {
			System.out.println(indice);
		}
	}
}
