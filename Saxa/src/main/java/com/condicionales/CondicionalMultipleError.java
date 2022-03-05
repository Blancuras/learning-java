package com.condicionales;
import java.util.Scanner;

public class CondicionalMultipleError {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digita un valor entero : "); 
		int a = sc.nextInt(); 
		
		if(a <= 5) { //bloque 1
			System.out.println("es un valor menor que 5"); 
		} else if (a <= 10) {   //bloque 2 - UNREACHABLE CODE 
			System.out.println("es un valor menor que 10");
		} else  { //bloque 3 
			System.out.println("es mayot que 10");
		}
	
			System.out.println("la variable a vale : " + a);
			sc.close();

	}
}
