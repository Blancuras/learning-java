package com.enero17;

import java.util.Scanner;

public class CondicionalMultiple {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digita un valor entero : ");
		int num = scanner.nextInt();

		if (num > 0) {
			// Bloque true primer condicional
			System.out.println("Es un valor positivo");
		} else if (num < 0) {
			// Bloque true segundo condicional
			System.out.println("Es un valor negativo");
		} else {
			// Bloque false
			System.out.println("Es un valor cero");
		}
		System.out.println("La variable num vale : " + num);
		scanner.close();

	}
}
