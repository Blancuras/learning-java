package com.sept29;

import java.util.Scanner;

public class Prueba2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		/*int numero1;
		float numero2, suma;
		System.out.println("Ingrese un numeros");
		numero1 = entrada.nextInt();
		System.out.println("Ingrese otro numero (decimal)");
		numero2 = entrada.nextFloat();

		suma = numero1 + numero2;

		System.out.println("La suma es: " + suma);*/ 
		
		//conversion 
		
		int x, y; 
		double division; 
		System.out.println("Ingrese un numero");
		x = entrada.nextInt(); 
		System.out.println("Ingrese otro numero");
		y = entrada.nextInt(); 
		
		division = (double)x / (double)y; 
		System.out.println("La division entre el primer numero y el segundo numero es : " + division);

	}

}
