package com.sept30;

import java.util.Scanner;

public class CicloDoWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num  ;
		int contador = 0;
		System.out.println("Ingresa un numero");
		num = entrada.nextInt(); // aqui hace la asignacion del usuario 
		System.out.println(num + contador);
		do {
			System.out.println(contador + ".---"); 
			contador++; 
		} while (contador < num);
	}

}
