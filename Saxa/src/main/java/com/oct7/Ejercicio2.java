package com.oct7;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in); 
	String cadena; 
	
	System.out.println("Digita una cadena"); 
	cadena = entrada.nextLine(); // guarda una cadena extensa, con espacios 
	entrada.close();
	System.out.println("La cadena es: " + cadena);
	}
}
