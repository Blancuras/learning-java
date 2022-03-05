/*
 * Crear y cargar una matriz de tamaño n x m, mostrar la suma de cada fila y de cada columna
 */
package com.oct14;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Matrices3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int matriz[][], numFilas, numCol, sumaFilas, sumaColumnas;

		numFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas: "));
		numCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas: "));
		matriz = new int[numFilas][numCol];
		System.out.println("Digite la matriz");
		for (int indice = 0; indice < numFilas; indice++) {
			for (int indice2 = 0; indice2 < numCol; indice2++) {
				System.out.print("Matriz[" + indice + "][" + indice2 + "]");
				matriz[indice][indice2] = entrada.nextInt();
			} 
		} 
		entrada.close();
		System.out.println("\nLa matriz es: "); 
		for(int indice = 0; indice<numFilas; indice++) {
			for (int indice2=0; indice2<numCol; indice2++) {
				System.out.print(matriz[indice][indice2]+" ");
			} 
			System.out.println(""); 
		} 
		//Ahora procedemos a sumar  las filas de la mattriz
		for(int indice = 0; indice<numFilas; indice++) {
			sumaFilas = 0; 
			for (int indice2=0; indice2<numCol; indice2++) {
				sumaFilas += matriz[indice][indice2]; 
			} 
			System.out.print("\nLa suma de la fila["+indice+"] es: " + sumaFilas);
		} 
		System.out.println(""); 
		
		//Por ultio sumamos las columnas 
		for(int indice0=0; indice0<numCol; indice0++) {
			sumaColumnas = 0; 
			for(int indice= 0; indice<numFilas; indice++) {
				sumaColumnas +=matriz[indice][indice0]; 
			} 
			System.out.println("\nLa suma de la columna ["+indice0+"] es: " + sumaColumnas);
		} 
		System.out.println("");
	}

}
