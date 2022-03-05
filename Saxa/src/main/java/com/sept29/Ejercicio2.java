package com.sept29;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);  
		/*int num, primero; 
		
		System.out.println("Ingresa un numero: ");
		num = entrada.nextInt(); 
		primero = num / 10; 
		System.out.println("El primer numero es: " +primero);*/
		
		int a,b,c; 
		int numero; 
		int x,y,z; 
		System.out.println("Ingresa el primer digito");
		a = entrada.nextInt(); 
		System.out.println("Ingresa el segundo digito");
		b = entrada.nextInt();
		System.out.println("Ingresa el tercer digito");
		c = entrada.nextInt(); 
		
		x = a * 10 * 10; 
		y = b * 10; 
		z = c * 1; 
		numero = x + y + z; 
		System.out.println("El numero es: " + numero);
	}

}
