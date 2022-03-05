package com.curso3;

import java.util.Scanner;

public class EvaluaEdad {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce tu edad.");

		int edad = entrada.nextInt();
		//si la condicion es cierta ejecuta lo que hay dentro del if e ignora todo lo demas
		if (edad <= 18) {

			System.out.println("Eres un adolescente");
		
		} else if (edad < 40) {
			System.out.println("Eres joven");
		
		} else if (edad < 65) {
			System.out.println("Eres maduro");
		
		} else {
			System.out.println("Cuidate");
		}

	}

}
