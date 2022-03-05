package com.condicionales;

import java.util.Scanner;

public class CondicionalMultiple {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digita un valor entero : ");
		int a = sc.nextInt();
		
		/**
		 * Tenemos un if que evalua una condicion booleana donde a >=0
		 */
		if (a >= 0) { // bloque true primer condicional
			System.out.println("es un valor positivo");
		} else { // bloque true segundo condicional
			System.out.println("es un valor negativo");
		} 

		System.out.println("la variable a vale : " + a);
		sc.close();
	}

}
