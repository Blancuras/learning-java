package com.enero28;

import javax.swing.JOptionPane;

public class Arreglo1 {

	public static void main(String[] args) {
		/*
		 * int[] listaNumeros = { 5, 8, 7, 2, 5 }; for (int indice = 0; indice < 4;
		 * indice++) { System.out.print(listaNumeros[indice]); } }
		 */

		String texto = JOptionPane.showInputDialog("Humano, escribe un texto");
		int longitud = texto.length();
		char[] caracteres = new char[longitud];
		int inverso = longitud;
		for (int indice = 0; indice < longitud; indice++) {
			caracteres[indice] = texto.charAt(inverso - 1);
			inverso--;
		}

	}
}