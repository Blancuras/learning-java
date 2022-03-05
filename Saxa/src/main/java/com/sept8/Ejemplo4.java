package com.sept8;

import java.util.Scanner;

public class Ejemplo4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a, b, c;
		System.out.println("Ingresa valor de a: ");
		a = entrada.nextInt();
		System.out.println("Ingresa valor de b: ");
		b = entrada.nextInt();
		System.out.println("Ingresa valor de c: ");
		c = entrada.nextInt();

		if (a > b && b > c) {
			System.out.println(a + "," + b + "," + c);
		} else {
			if (a > c && c > b) {
				System.out.println(a + "," + c + "," + b);
			} else {
				if (b > a && a > c) {
					System.out.println(b + "," + a + "," + c);
				} else {
					if (b > c && c > a) {
						System.out.println(b + "," + c + "," + a);
					} else {
						if (c > a && a > b) {
							System.out.println(c + "," + a + "," + b);
						} else {
							if (c > b && b > a) {
								System.out.println(c + "," + b + "," + a);
							}
						}
					}
				}
			}
		}

	}

}
