package com.oct13;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Matriz {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		int matriz1[][], nFilas, nColumnas; 
		
		nFilas= Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas: "));
		nColumnas= Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas: "));
		
		matriz1 = new int[nFilas][nColumnas];  
		
		System.out.println("Digite la matriz: ");
		
		for(int indice = 0; indice <nFilas; indice++ ) {
			for(int j = 0; j<nColumnas; j++) {
				System.out.println("Matriz ["+ indice +"]["+ j + "]: "); 
				matriz1[indice] [j] = entrada.nextInt();
			}  
		}
		System.out.println("\nLa matriz es: ");
		entrada.close();
		for (int indice = 0; indice < nFilas; indice++) { // numero de filas
			for (int j = 0; j < nColumnas; j++) {// numero de columnas
				System.out.print(matriz1[indice][j]);
			}
			System.out.println("");
		}

	}
}
