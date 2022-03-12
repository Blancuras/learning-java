//numero primo tiene dos divisores 
package com.feb11;

import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero= 0;
		int contador = 0;  
		System.out.println("Digite un numero: "); 
		numero = entrada.nextInt(); 
		
		for(int iterador = 1; iterador <= numero; iterador++) { 	//Un numero primo no puede dividirse entre 0
			if(numero % iterador ==0) {
				contador++; 
			}
		}
		
		if(contador ==2) {
			System.out.println("El numero es primo");
		} else {
			System.out.println("El numero no es primo"); 
		}
	}

}
