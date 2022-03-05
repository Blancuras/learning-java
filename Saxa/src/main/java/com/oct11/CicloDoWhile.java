package com.oct11;

import java.util.Scanner;

public class CicloDoWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int indice = 1, contador; 
		
		System.out.println("Digite la cantidad de terminos"); 
		contador = entrada.nextInt();
		entrada.close();
		
		do {
			System.out.println(indice); 
			indice++; 
		}while(indice <= contador); 
	}

}
