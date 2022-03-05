package com.oct13;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Insercion {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int arreglo[], nElementos, posicion, auxiliar;
		nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el  numero de elementos"));
		arreglo = new int[nElementos];

		System.out.println("Digite el arreglo ");
		for (int indice = 0; indice < nElementos; indice++) {
			System.out.println((indice + 1) + ". Digite un numero: ");
			arreglo[indice] = entrada.nextInt();
		} 
		entrada.close();

		// ordenamiento por insercion

		for (int indice = 0; indice < nElementos; indice++) {
			posicion = indice;
			auxiliar = arreglo[indice];

			while ((posicion > 0) && (arreglo[posicion - 1] > auxiliar)) {
				arreglo[posicion] = arreglo[posicion - 1];
				posicion--;
			}
			arreglo[posicion] = auxiliar;
		}
		System.out.print("\nOrden Ascendente: ");
		for (int indice = 0; indice < nElementos; indice++) {
			System.out.print(arreglo[indice] + " - ");
			
			System.out.print("Orden Desendente: ");
			for (int indice1 = (nElementos - 1); indice1 >= 0; indice1--) {
				System.out.print(arreglo[indice1] + "  - ");
			} 
			System.out.println("");
		}
	}
}
