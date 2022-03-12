package com.enero27;

import java.util.Scanner;

public class CicloDoWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		int num, contador = 0; 
		System.out.println("Ingresa un numero: "); 
		num = entrada.nextInt(); 
		do {
			System.out.println(contador + ".");
			contador++; 
		}while(contador < num); 
		entrada.close();
	}

}
