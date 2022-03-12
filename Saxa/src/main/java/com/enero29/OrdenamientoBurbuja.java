package com.enero29;

import javax.swing.JOptionPane;

public class OrdenamientoBurbuja {

	public static void main(String[] args) {
		// 5,4,2,1,3
		String texto = JOptionPane.showInputDialog("Ingresa numeros divididos con coma");
		String numerosEnTexto[] = texto.split(",");
		int cantidad = numerosEnTexto.length;
		int numeros[] = new int[cantidad], temporal;
		for (int indice = 0; indice < cantidad; indice++) {
			numeros[indice] = Integer.parseInt(numerosEnTexto[indice]);
		}
		for (int indice = 0; indice < cantidad - 1; indice++) {
			for (int indice2 = 0; indice < (cantidad - 1); indice2++) {
				if (numeros[indice2] > numeros[indice2 + 1]) {
					temporal = numeros[indice2];
					numeros[indice2] = numeros[indice2 + 1];
					numeros[indice2 + 1] = temporal;
				}
			}
		}
		
		System.out.println("Aqui estan tus numeros de forma ascendente");
		for (int indice = 0; indice < cantidad; indice++) {
			System.out.println(numeros[indice] + ",");
		}
		System.out.println("\nAqui estan tus numeros de forma ascendente");
		for (int indice = cantidad - 1; indice > 0; indice--) {
			System.out.println(numeros[indice] + ",");
		}
	}

}
