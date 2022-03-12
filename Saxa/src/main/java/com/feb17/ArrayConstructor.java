package com.feb17;

import java.util.Scanner;

public class ArrayConstructor {
	private int arreglo[];

	//Constructor
	public ArrayConstructor(int numElementos) {
		Scanner entrada = new Scanner(System.in);
		arreglo = new int[numElementos];
		for (int indice = 0; indice < arreglo.length; indice++) {
			System.out.println("Digite un valor: ");
			arreglo[indice] = entrada.nextInt();
		}
	} 
	
	public void imprimir() {
		System.out.println("");
		for(int indice = 0; indice < arreglo.length; indice++) {
			System.out.println("Valor : " + arreglo[indice]);
		}
	}
}
