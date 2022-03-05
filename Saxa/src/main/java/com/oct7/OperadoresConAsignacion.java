package com.oct7;

public class OperadoresConAsignacion {

	public static void main(String[] args) {
		/*
		 * int numero = 10; numero += 5; //numero = numero + 5
		 * System.out.println(numero);
		 */

		// OPERADORES CON INCREMENTO Y DECREMENTO

		// int x = 5;
		// x++; //x+=1 aumenta en uno el valor de la variable

		int x = 5, y;
//		x++;
//		y = x;
		System.out.println("X1 "+ ++x); 
		System.out.println("X2 "+ x);
		y = x++;   //++x (prefijo )primero hace el incremento y despues la asignacion 
		//x++(sufijo)primero hace la asignacion y despues el incremento
		System.out.println("X "+ x);
		System.out.println("Y "+ y);

	}

}
