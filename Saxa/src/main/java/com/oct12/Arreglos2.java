package com.oct12;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Arreglos2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		int nElementos;

		nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo"));
		char[] letras = new char[nElementos];
		System.out.println("Digite los elementos de un arreglo: ");
		for (int indice = 1; indice < nElementos; indice++) {
			System.out.println((indice + 1) + ". Digite un caracter: "); 
			letras[indice] = entrada.next().charAt(0); 
		}  
		entrada.close();
		System.out.println("\nLos caracteres del arreglo son: "); 
		for (int indice = 0; indice <nElementos; indice++) {
			System.out.println(letras[indice] + " ");
		}
	}

}
