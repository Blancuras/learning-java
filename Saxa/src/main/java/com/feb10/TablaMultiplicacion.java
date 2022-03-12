/*
 * Mostrar la tabla de multiplicacion de un numero dede el 1 hasta el 12.
 */
package com.feb10;

import java.util.Scanner;

public class TablaMultiplicacion {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		int numero; 
		
		System.out.println("Digite el numero que desea mostrar la tabla de multiplicacion (1-12):");
		numero = entrada.nextInt(); 
		
		for(int iterador = 1; iterador <=12; iterador++) {
			System.out.println(+iterador + " x " + numero + " = " + iterador * numero);
		}
	}

}
