package com.sept29;

import java.util.Scanner;

public class RaizCuadrada {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		int num; 
		double raiz; 
		System.out.println("Ingresa un numero: "); 
		num = entrada.nextInt(); 
			
		raiz = Math.sqrt(num); 
		System.out.println("La raiz cuadrada es: " + raiz);
	}

}
