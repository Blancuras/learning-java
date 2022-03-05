package com.oct13;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MetodoBurbuja {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int arreglo[], nElementos, aux;

		nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidadad de elementos"));
		arreglo = new int[nElementos]; // Le asignamos el numero de elementos al arreglo

		for (int indice = 0; indice < nElementos; indice++) {
			System.out.print((indice + 1) + ". Digite un numero: ");
			arreglo[indice] = entrada.nextInt();
		}
		entrada.close();
		// Metodo Burbuja
		for (int indice = 0; indice < (nElementos); indice++) {
			for (int j = 0; j < (nElementos - 1); j++) {
				if (arreglo[j] > arreglo[j + 1]) { // si numeroActual > numeroSiguiente
					aux = arreglo[j];
					arreglo[j] = arreglo[j + 1];
					arreglo[j + 1] = aux;
				}
			}
		}
		// Mostrando el arreglo ordenado en forma creciente
		System.out.print("\nArreglo ordenado en forma creciente ");
		for (int indice = 0; indice < nElementos; indice++) {
			System.out.print(arreglo[indice] + " - ");
		} 
		System.out.print("\nArreglo ordenado en forma decreciente "); 
		for(int indice = (nElementos - 1); indice >= 0; indice--) {
			System.out.print(arreglo[indice] + " - ");
		}
	}

}
