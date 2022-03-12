package com.feb12;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class BuscarElemento {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int arreglo[];
		int numElementos;
		int elementoABuscar;

		numElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el tamano del arreglo"));
		arreglo = new int[numElementos];

		for (int indice = 0; indice < numElementos; indice++) {
			System.out.println("Digite un elemento en la posicion [" + indice + "] : ");
			arreglo[indice] = entrada.nextInt();
		}

		for (int indice = 0; indice < numElementos; indice++) {
			System.out.println(arreglo[indice] + " en la posicion " + indice);
		}
		System.out.println("");

		System.out.print("Digite el elemento a buscar ");
		elementoABuscar = entrada.nextInt();

		System.out.println("");

		int iterador = 0;
		boolean encontrado = false;

		while (iterador < numElementos && encontrado == false) {
			if (arreglo[iterador] == elementoABuscar) {
				encontrado = true;
			}
			iterador++;
		}

		if (encontrado == false) {
			System.out.println("\nElemento no encontrado en el array ");
		} else {
			System.out.println("\nElemento encontrado en la posicio " + (iterador - 1));
		}
	}

}
