package com.oct1;

import java.util.Scanner;

public class CicloFor2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);  
		
		int num; 
		int pares; 
		
		System.out.println("Ingresa un numero: "); 
		num = entrada.nextInt(); 
		for (int contador = 0; contador <= num; contador++) {
			pares = 2 * contador ; 
			System.out.println("numero = " + pares);
		}
	
		
	}

}
