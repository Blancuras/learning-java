package com.sept30;

import java.util.Scanner;

public class Ejemplo2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num, multiplo;
		System.out.println("Ingresa un numero: ");
		num = entrada.nextInt();
		System.out.println("Ingresa el multiplo: ");
		multiplo = entrada.nextInt();
		if (num % multiplo == 0) { // 8 % 4  0 
			System.out.println("Es multiplo");
		} else {
			System.out.println("No es multiplo");
		}

	}

}
