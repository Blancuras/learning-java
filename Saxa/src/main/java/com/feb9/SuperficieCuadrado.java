package com.feb9;

import java.util.Scanner;

public class SuperficieCuadrado {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float superficie;
		float lado;

		System.out.print("Digite el lado del cuadrado");
		lado = entrada.nextFloat();
		superficie = lado * lado; 
		System.out.println("La superficie del cuadrado es: " + superficie); 
	}

}
