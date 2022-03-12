package com.enero20;

import javax.swing.JOptionPane;

public class UsoArrays3 {

	public static void main(String[] args) {
		String[] paises = new String[3];

		for (int indice = 0; indice < 3; indice++) {
			paises[indice] = JOptionPane.showInputDialog("Introduce pais " + (indice + 1));

		}
		for (String elemento : paises) {
			System.out.println("Pais: " + elemento); 
		}
	}
}
