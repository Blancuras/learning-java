package com.sept30;

import java.util.Scanner;

public class CicloWhile5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		int num, digito; 
		int suma = 0; //(contador)
		System.out.println("Ingresa un numero");
		num = entrada.nextInt(); 
		while(num > 0) {
			digito = num % 10; 
			num = num / 10; 
			suma = suma + digito;  
			
		} 
		System.out.println("La suma de los digitos es: " + suma);
	}

}
