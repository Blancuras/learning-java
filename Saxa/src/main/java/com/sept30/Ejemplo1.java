package com.sept30;

import java.util.Scanner;

public class Ejemplo1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num;
		System.out.println("Ingresa un numero");
		num = entrada.nextInt();
		if (num % 2 == 0) {
			System.out.println("Es par");
		} else {
			System.out.println("Es impar");
		}

	}

}
