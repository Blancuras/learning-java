package com.feb12;

import java.util.Scanner;
//	CHECAR POR QUE SE REPITEN LOS ELEMENTOS ORDENADOS
import javax.swing.JOptionPane;

public class MetodoBurbujaString {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nombres[];
		int numElementos;
		
		numElementos = Integer.parseInt(JOptionPane.showInputDialog("Digiteb la cantidad de elementos que desea "));
		nombres = new String[numElementos]; 
		
		for(int indice = 0; indice < numElementos; indice++) {
			System.out.println("Digite un nombre: ");
			nombres[indice] = entrada.next();
		} 
		
		System.out.println(""); 
		System.out.println("El arreglo desordenado: "); 
		for(int indice = 0; indice < numElementos; indice++) {
			System.out.println(nombres[indice] + " ");
		} 
		
		//Metodo Burbuja 
		String auxiliar; 
		for( int indice = 0; indice <(numElementos - 1); indice++) {
			for(int iterador = 0; iterador <(numElementos -1); iterador++) {
				if(nombres[iterador].compareTo(nombres[iterador + 1]) > 0) {
					auxiliar = nombres[iterador]; 
					nombres[iterador] = nombres[indice+1]; 
					nombres[iterador + 1] = auxiliar; 
				}
			}
		} 
		System.out.println("El arreglo ordenado es:");
		for(int iterador = 0; iterador < numElementos; iterador++) {
			System.out.println(nombres[iterador] + " ");
		}  
	}
}
