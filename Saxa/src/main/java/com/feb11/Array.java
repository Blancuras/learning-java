package com.feb11;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Array {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		int arreglo[]; 
		int numElementos;  
		int posicionMayor = 0; 
		int posicionMenor = 0; 
		
		numElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos para su arreglo")); 
		arreglo = new int[numElementos]; 
		
		//Llenamos el arreglo 
		for(int indice = 0; indice < arreglo.length; indice++) {
			System.out.println("Digite un elemento en la posicion " + indice + " : "); 
			arreglo[indice] = entrada.nextInt(); 
		} 
		
		int mayorElemento = arreglo[0]; //5
		int menorElemento = arreglo[0]; // 10 20 30
	
		
		//buscando el menos
		for(int indice = 0; indice < arreglo.length; indice++) {
			if(mayorElemento > arreglo[indice]) {
				mayorElemento = arreglo[indice]; 
				mayorElemento = indice; 
			}
		} 
		//buscando al mayor
		for(int indice = 0; indice < arreglo.length; indice++) {
			if(menorElemento < arreglo[indice]) {
				menorElemento = arreglo[indice]; 
				posicionMenor = indice; 
			}
		} 
		
		System.out.println("");
		System.out.println("El elemento mayor es: " + mayorElemento + " en la posicion " + posicionMayor);
		System.out.println("El elemnto menor es: " + menorElemento + " en la posicion " + posicionMenor);
	}

}
