package com.oct21;

import java.util.Scanner;

public class CondicionalesCompuestas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valor1, valor2;
		System.out.println("Introduce el sueldo");
		valor1 = teclado.nextInt();
		System.out.println("Introduce el sueldo");
		valor2 = teclado.nextInt(); 
		teclado.close();
		
		if (valor1 > valor2) {
			System.out.println("El valor introducido en primer lugar es el mayor");
			System.out.println(valor1);
		} else {
			System.out.println("El valor introducido en segundo lugar es el mayor");
			System.out.println(valor2);
		}
	}

}
