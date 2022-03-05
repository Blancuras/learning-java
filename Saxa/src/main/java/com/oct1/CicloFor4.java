package com.oct1;

import java.util.Scanner;

public class CicloFor4 {
//Pedir 5 numeros y escribir la suma total

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int num;
		int sumaTotal = 0;
		for (int contador = 1; contador <= 5; contador++) {
			System.out.println("Ingrese un numero");
			num = entrada.nextInt();
			sumaTotal = sumaTotal + num;

		}
		System.out.println("La suma total es: " + sumaTotal);
	}

}
