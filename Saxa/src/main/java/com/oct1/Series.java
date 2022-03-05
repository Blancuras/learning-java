package com.oct1;

import java.util.Scanner;
//Generar Impares 
public class Series {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);  
		int num; 
		System.out.println("Ingresa un numero"); 
		num = entrada.nextInt(); 
		int contador = 0; 
		int impares = 0; 
		while(contador <= num) {
			impares = 2 * contador;
			System.out.println(impares);
			contador++; 
		}
	}

}
