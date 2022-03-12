package com.enero18;

import java.util.Scanner;

public class EvaluaEdad {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tu edad");
		int edad = entrada.nextInt(); // lo que introduzca el usuario se almacene en la variable edad

		if (edad < 10) {
			System.out.println("Es un bebe");
		} else if (edad < 18) {
			System.out.println("Eres un adolescente");
		} else if (edad < 40) {
			System.out.println("Eres joven"); 
		} else if (edad < 50) {
			System.out.println("Eres don"); 
		} else if (edad < 65) {
			System.out.println("Eres maduro");
		} else {
			System.out.println("Cuidate");
		}

	}

}
