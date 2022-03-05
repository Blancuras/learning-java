package com.sept29;

import java.util.Scanner;

public class Prueba3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		
		String cadena; 
		System.out.println("Digite una palabra: ");
		cadena = entrada.nextLine(); 
		
		// char 
		char letra; 
		System.out.println("Digita una letra"); 
		letra = entrada.next().charAt(0); 
		System.out.println("Mi letra es: " + letra + " la palabra es " + cadena);
		
	}

}
