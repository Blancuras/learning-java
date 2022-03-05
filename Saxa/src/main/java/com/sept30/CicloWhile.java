package com.sept30;

import java.util.Scanner;

public class CicloWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		int contador = 0; 
		int limite = 5; 
		
		while(contador < limite) { 
			System.out.println("numero  = " + contador);
			contador++; 
		}
			
	}

}
