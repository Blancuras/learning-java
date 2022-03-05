package com.oct21;

import java.util.Scanner;

public class CondicionalesAnidadas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int nota1, nota2, nota3;
		System.out.print("Ingrese primer nota: ");
		nota1 = teclado.nextInt();
		System.out.print("Ingrese segunda nota: ");
		nota2 = teclado.nextInt();
		System.out.print("Ingrese tercer nota: ");
		nota3 = teclado.nextInt();
		int media = (nota1 + nota2 + nota3) / 3;
		teclado.close();
		if (media == 9 || media == 10) {
			System.out.println("Sobresaliente");
		} else if (media == 5) {
			System.out.println("Suficiente");
		} else if (media == 6) {
			System.out.println("Bien");
		} else if (media == 7 || media == 8) {
			System.out.println("Regular/Bien");
		} else {
			System.out.println("Insuficiente");
		}

		/*
		 * if (media >= 7) { System.out.println("Notable/Sobresaliente"); } else { if
		 * (media >= 4) { System.out.println("Regular/Bien"); } else {
		 * System.out.println("Regular/ Bien"); } }
		 */
	}
}