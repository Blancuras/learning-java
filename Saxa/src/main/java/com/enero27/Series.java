package com.enero27;

import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num; 
		System.out.println("Ingresa un numero"); 
		num = entrada.nextInt(); 
		int contador = 1; 
		int indice = 0; 
		while (contador <= num) {
			indice = 2 * contador -1; 
			System.out.println(indice); 
			contador++; 
			entrada.close();
		}
		
		
	}

}
