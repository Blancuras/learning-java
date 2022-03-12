package com.feb9;

import java.util.Scanner;

public class NumeroMayor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int numero1;
		int numero2;

		System.out.println("Intrduce el primer numero");
		numero1 = entrada.nextInt();

		System.out.println("Introduce el segundo numero");
		numero2 = entrada.nextInt();

		int mayor = Math.max(numero1, numero2);
		int menor = Math.min(numero1, numero2);

		System.out.println("El numero mayor es: " + mayor);
		System.out.println("El numero menor es: " + menor);

	}

}
