package com.sept30;

import java.util.Scanner;

public class CicloWhile2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num; 
		int contador = 0; 
		System.out.println("Ingresa un numero"); 
		num = entrada.nextInt(); 
		while(contador < num) {
			System.out.println(contador + ".");
			contador++; 
		}
	}

}
