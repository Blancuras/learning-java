package com.feb11;

import java.util.Scanner;

public class PositivosYNegativos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int arreglo[];
		int numElementos;
		int contadorPositivos = 0;
		int contadorNegativos = 0;
		int contadorCeros = 0;

		System.out.println("Digita la cantidad de elementos para tu arreglo :");
		numElementos = entrada.nextInt();

		arreglo = new int[numElementos];
		System.out.println("");
		for (int iterador = 0; iterador < numElementos; iterador++) {
			System.out.println("Digite un elemento " + iterador + " : ");
			arreglo[iterador] = entrada.nextInt();

			if (arreglo[iterador] > 0) {
				contadorPositivos++;
			} else if (arreglo[iterador] < 0) {
				contadorNegativos++;
			}
		} 
		System.out.println(""); 
		
		int[] arregloPositivos = new int[contadorPositivos]; 
		int[] arregloNegativos = new int[contadorNegativos]; 
		
		contadorNegativos = 0; 
		contadorPositivos = 0; 
		
		for(int iterador = 0; iterador <  numElementos; iterador++) {
			if(arreglo[iterador] > 0) {
				arregloPositivos[contadorPositivos] = arreglo[iterador]; 
				contadorPositivos ++; 
			} else if(arreglo[iterador] <0) {
				arregloNegativos[contadorNegativos] = arreglo[iterador]; 
				contadorNegativos++; 
			}
		} 
		
		System.out.println(""); 
		
		//Imprimimos el arreglo de positivos 
		System.out.println("El arreglo de positivos es: ");
		for(int iterador = 0; iterador < contadorPositivos; iterador++) {
			System.out.println(arregloPositivos[iterador]);
		} 
		
		//IMprimimos el arreglo de negativos  
		
		System.out.println("El arreglo de negativos es: ");
		for(int iterador = 0; iterador < contadorPositivos; iterador++) {
			System.out.println(arregloNegativos[iterador]);
		} 
		
		System.out.println(""); 
		System.out.println("La cantidad de ceros en el arreglo es : " + contadorCeros);
	}

}
