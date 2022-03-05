package com.condicionales;

import java.util.Scanner;

public class CondicionalAnidado {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digita un valor entero : ");
		int a = sc.nextInt();

		if (a >= 0) {
			// bloque 1
			if (a < 10) {
				// bloque 3
				if (a < 5) {
					// bloque 5
					System.out.println("valores entre 0 y 4");
				} else {
					// bloque 6
					System.out.println("valores entre 5 y 9");
				}
			} else {
				// bloque 4
				System.out.println("valores mayors e iguales a 10");
			}
		} else {
			// bloque 2
			System.out.println("valores negativos");
		}

		System.out.println("la variable a vale : " + a);
		sc.close();
	}
}
