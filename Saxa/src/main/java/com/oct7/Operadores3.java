package com.oct7;

import java.util.Scanner;

/*Guillermo tiene N dolares. Luis tiene la mitad de lo que posee Guillermo. Juan tiene la mitad  
 * de lo que poseen Luis y Guillermo juntos. Hacer un programa que calcule e imprima la cantidad  
 *de dinero que tienen entre los tres. 
 */
public class Operadores3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		float guillermo, luis, juan, total;

		
		System.out.println("Digita la cantidad de dinero que tiene Guillermo "); 
		guillermo = entrada.nextFloat(); 
		entrada.close();
		
		luis = guillermo/2; //Luis tiene l mitad de lo de Gullermo 
		juan = (guillermo + luis)/2; 
		
		
		total = guillermo + luis + juan; 
		System.out.println("\nLa cantidad de dinero entre los 3 es: " + total);
		
	}

}
