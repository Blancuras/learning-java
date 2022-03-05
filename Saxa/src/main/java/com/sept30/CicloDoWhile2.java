package com.sept30;

import java.util.Scanner;

public class CicloDoWhile2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		int num; 
		int contador =1; 
		int pares; 
		System.out.println("Ingresa un numero"); 
		num = entrada.nextInt();
		do {
			pares = 2 * contador - 2; 
			System.out.println(pares + ".");
			contador++; 
		}while(contador <= num); 
	}

}
