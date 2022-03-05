package com.oct1;

import java.util.Scanner;

//Leer 5 numeros y mostrarlos en el mismo orden introducido.
public class Array2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] array = new int[5];
		for (int contador = 0; contador < 5; contador++) {
			System.out.println("Ingrese un numero: ");
			array[contador] = entrada.nextInt();

		} 
		System.out.println("Los numeros son");
		for (int contador = 0; contador < 5; contador++) {
			System.out.println(array[contador]);
		}
	}

}
