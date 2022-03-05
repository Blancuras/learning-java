/*
 * Leer por teclado una serie de 10 numeros enteros. la aplicacion debe indicarnos si los 
 * numeros estan ordenados de forma creciente, decreciente o si estan desordenados.  
 */
package com.oct13;

import java.util.Scanner;

public class Arreglos7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		int arreglo[] = new int[10]; //Creamos el arreglo de 10 elementos enteros 
		boolean creciente = false, decreciente = false; 
		
		System.out.println("Llenar el arreglo"); 
		for(int indice = 0; indice<10; indice++) {
			System.out.print((indice + 1) + ". Digite un numero: ");
			arreglo[indice] = entrada.nextInt(); 
		}  
		entrada.close();
		
		for(int indice = 0; indice <9; indice++) {
			if(arreglo[indice] < arreglo[indice + 1]){ //Creciente: 1-2-3-4-5...
				creciente = true; 
			} 

			if(arreglo[indice] >arreglo[indice + 1]){ //Decreciente 5-4-3-2-1
				decreciente = true; 
			}
		} 
		
		if(creciente && !decreciente) {
			System.out.println("\nEl arreglo esta en forma creciente");
		} else if(!creciente && decreciente ) {
			System.out.println("\nEl arreglo esta en forma decreciente");
		} else if(creciente  && decreciente) {
			System.out.println("\n El arreglo esta desordenado");
		}else if(!creciente && !decreciente) {
			System.out.println("\nTodos los numeros del arreglo son iguales");
		}
	}

}
