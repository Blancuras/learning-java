package com.condicionales;
import java.util.Scanner;


public class CondicionalSimple {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digita un valor entero : "); 
		int a = sc.nextInt(); 
		
		if(a >= 0) { //bloque true 
			System.out.println("es un valor positivo"); 
		}
	
			System.out.println("la variable a vale : " + a);
			sc.close();
		
	}  
} 
	
	
