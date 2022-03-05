package com.sept29;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Ingrese su edad"); 
		/*int edad = Integer.parseInt(entrada.nextLine()); 
		System.out.println(" Tu edad es: " + edad);*/ 
		
		int edad; 
		edad = entrada.nextInt(); 
		System.out.println("Tu edad es: " + edad);
	}

}
