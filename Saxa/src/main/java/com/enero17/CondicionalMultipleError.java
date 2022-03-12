package com.enero17;

import java.util.Scanner;

public class CondicionalMultipleError {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digita un valor entero : ");
		int num = scanner.nextInt();
		if (num == 20) {
			// Bloque 2 
			System.out.println("Num 20"); 
		}else if (num > 10) {
			// Bloque 1
			System.out.println("Es un valor mayor que 10");
		}else if (num == 6) {
			// Bloque 2 
			System.out.println("Entro al 666"); 
		} else if (num > 5) {
			// Bloque 2 
			System.out.println("Es un valor mayor que 5"); 
		} else {
			// Bloque 3
			System.out.println("Es un valor menor o igual a 5");
		}
		System.out.println("La variable num vale : " + num);
		scanner.close(); 

	}
	}


