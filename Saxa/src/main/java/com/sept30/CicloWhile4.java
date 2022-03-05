package com.sept30;

import java.util.Scanner;

public class CicloWhile4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);  
		int num, digito; 
		int contador = 0; 
		System.out.println("Ingrese un numero: "); 
		num = entrada.nextInt(); 
		while (num > 0) {
			digito = num % 10; 
			num = num / 10; 
			contador++; 
		}
		System.out.println("Numero de digitos es: " + contador);
		String numUser = ""+entrada.nextInt();
		System.out.println("Numero de digitos son "+ numUser.length());
		
	}

}
