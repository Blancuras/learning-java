package com.oct1;

import java.util.Scanner;

public class Series4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num, Limite;
		System.out.println("Numero Limite: ");
		Limite = entrada.nextInt();
		for (int contador = 0; contador <= Limite; contador++) {
			num = contador + 1;
			while(num <=Limite) {
				System.out.println(num - contador);
				num++; 
			}
			System.out.println("");
		}
	}

}
