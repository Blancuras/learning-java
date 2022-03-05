package com.oct1;

import java.util.Scanner;

//Realiza un programa que pida 6 numeros enteros y que luego muestre esos 
//numeros junto con la palabra "par" o "impar" segun proceda.
public class Array3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] numero = new int[6];
		System.out.println("Ingresa 6 numeros");
		for (int contador = 0; contador < 6; contador++) {
			numero[contador] = entrada.nextInt();
		}
		for (int contador = 0; contador < 6; contador++) {
			if (numero[contador] % 2 == 0) {
				System.out.println(numero [contador] +  "= par");
			} else {
				System.out.println(numero [contador] + "= None");
			} 
		}

	}
}