package com.enero29;

import javax.swing.JOptionPane;

public class MezclarDosArreglos {

	public static void main(String[] args) {
		int arreglo[] = new int[5], arregloDos[] = new int[5], arregloTres[] = new int[10];
		for (int indice = 0; indice < 5; indice++) {
			arreglo[indice] = Integer
					.parseInt(JOptionPane.showInputDialog("Ingresa el valor " + (indice + 1) + " del arreglo "));
		}
		for (int indice = 0; indice < 5; indice++) {
			arregloDos[indice] = Integer
					.parseInt(JOptionPane.showInputDialog("Ingresa el valor " + (indice + 1) + " del arreglo 2 "));
		}
		int var = 0;
		for (int indice = 0; indice < 5; indice++) {
			arregloTres[var] = arreglo[indice];
			var++;
			arregloTres[var] = arregloDos[indice];
			var++;
		}
		for(int elemento: arregloTres) {
			System.out.print(elemento);
		}

	}

}
