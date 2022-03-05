package com.sept29;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		int primerDigito, segundoDigito, ultimoDigito, num; 
		System.out.println("Ingresa un numero"); 
		num = entrada.nextInt(); 
		ultimoDigito = num %10; // 987 % 10  toca 98 sobra 7 ultimiDigito  (num == 987, ud==7)
		num = num/10; // Div /10     98 / 10  == 9 y sobran 8 (num == 98)
		segundoDigito = num % 10;  // (num == 98, sd==8)
		num = num /10;   // (num == 9)
		primerDigito = num % 10; // (num == 9, sd==9) 
		
		System.out.println("Primer digito " + primerDigito);
		System.out.println("Segundo digito " + segundoDigito);
		System.out.println("Ultimo digito " + ultimoDigito);
	}

}
