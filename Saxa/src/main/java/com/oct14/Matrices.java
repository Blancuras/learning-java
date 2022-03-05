/*
 * Crear y cargar una matriz de tamaño n x m y decir si es simetrica o no.
 */
package com.oct14;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Matrices {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int matriz[][], numFilas, numCol;
		boolean simetrica = true; 
		
		numFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas: "));
		numCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas: "));

		matriz = new int[numFilas][numCol];

		System.out.println("Digite una matriz: ");
		for (int indice = 0; indice < numFilas; indice++) {
			for (int indice2 = 0; indice2 < numCol; indice2++) {
				System.out.println("Matriz [" + indice + "] [" + indice2 + "]: ");
				matriz[indice][indice2] = entrada.nextInt();

			}
		}
		entrada.close();
		if(numFilas == numCol) {    //Si el numero de filas es igual al numero de columnas 
			int indice, j; 
			indice=0; 
			while(indice<numFilas && simetrica == true) {
				j = 0; 
				while(j <indice && simetrica == true) {
					if(matriz[indice][j] != matriz[j][indice]) {
						simetrica = false; 
					} 
					j++; 
				} 
				indice++; 
			} 
				if(simetrica == true) {
					JOptionPane.showMessageDialog(null, "La matriz es simetrica");
				} else {
					JOptionPane.showMessageDialog(null, "La matriz no es simetrica");
				}
			
		}else {
			JOptionPane.showMessageDialog(null, "La matriz no es simetrica");
		}
		
	}
}
