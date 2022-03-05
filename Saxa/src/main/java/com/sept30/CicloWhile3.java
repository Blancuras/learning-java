package com.sept30;

import java.util.Scanner;

public class CicloWhile3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		
		int num, par; 
		int contador = 1; 
		System.out.println("Ingrese un numero "); 
		num = entrada.nextInt();  
		
		while(contador <= num) {
			par = 2* contador - 2; 
			System.out.println(par + "."); 
			contador++; 
		}
	}

}
