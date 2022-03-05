package com.oct1;

import java.util.Scanner;

public class CicloFor3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);  
		int num; 
		System.out.println("Ingresa un numero: ");
		num = entrada.nextInt();
		for(int contador = 0; contador <= num; contador += 5) {
			System.out.println(contador);
		}
	}

}
