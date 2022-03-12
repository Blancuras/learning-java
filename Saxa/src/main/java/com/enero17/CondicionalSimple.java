package com.enero17;

import java.util.Scanner;

public class CondicionalSimple {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Entrada de datos desde la consola
		System.out.println("Digita un valor entero : ");
		int num = scanner.nextInt();

		if (num >= 0) {
			// Bloque true
			System.out.println("Es un valor positivo");
		} 
			System.out.println("La variable num vale : " + num);
			scanner.close();
			
		}
	}

