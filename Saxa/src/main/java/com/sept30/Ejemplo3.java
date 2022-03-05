package com.sept30;

import java.util.Scanner;

public class Ejemplo3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num1, num2;
		System.out.println("Ingresa el primer numero");
		num1 = entrada.nextInt();
		System.out.println("Ingresa el segundo numero");
		num2 = entrada.nextInt();

		if (num1 == num2) {
			System.out.println("Son iguales");
		} else if (num1 > num2) {
			System.out.println(num1 + " Es mayor que " + num2);
		} else {
			System.out.println(num1 + " Es menor que " + num2);
		}
	}

}
