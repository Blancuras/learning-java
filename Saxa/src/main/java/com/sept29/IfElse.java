package com.sept29;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num;
		System.out.println("Ingresa un numero ");
		num = entrada.nextInt();

		if (num > 0) {
			System.out.println("El numero es positivo");
		} else {
			System.out.println("El numero es negativo");
		}
	}

}
