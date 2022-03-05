package com.sept29;

import java.util.Scanner;

public class PruebaApp {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num; 
		double cuadrado; 
		System.out.println("Ingresa un numero"); 
		num = entrada.nextInt(); 
		cuadrado = Math.pow(num, 2); //		cuadrado = num * num;
		System.out.println("El cubo de este numero es: "+cuadrado);
	}

}
