/*
 * Crear una matriz "marco" de tamaño 5x5: todos sus elementos deben ser 0 salvo los de los bordes que 
 * deben ser 1. Mostrarla.
 */
package com.oct14;

public class Matrices4 {

	public static void main(String[] args) {
		int matriz[][]= new int[5][5]; 
		
		//Rellenando la matriz 
		for(int indice= 0; indice<5; indice++) {
			for(int j=0; j<5;j++) {
				if(indice==0 || indice ==4) { // Delimita las columnas
					matriz[indice][j] = 1; 
				} else if(j==0 || j==4){
					matriz[indice][j]= 1; 
				}else {
					matriz[indice][j]= 0; 
				}
			}
		} 
		System.out.println("La matriz es: \n");
		for(int indice=0; indice<5; indice++) {
			for(int j = 0; j<5; ++j) {
				System.out.print(matriz[indice][j] +" ");
			} 
			System.out.println("");
		} 
		System.out.println("");
	}

}
