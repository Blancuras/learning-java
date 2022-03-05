package com.switches;
import java.util.Scanner;

public class OperadoresTernarios {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		System.out.println("Digita un valor entero : "); 
		int a = sc.nextInt(); 
		
		boolean ok = true;
		boolean error = false;
		// Expresion Booleana ? true : false;
		String message = ok ? "Ok ": "Error";
		String message2 = error ? "Error ": " OK";
		
		String res = ""; 
		if (a >= 0) { 
			res = "valor positivo"; 
		} else { 
			res = "valor negativo"; 
		}
		System.out.println(res);
		
		res = a >= 0 ? "valor positivo" : "valor negativo"; 
		System.out.println(res); 
		
		System.out.println("la variable a vale : " + a); 
		sc.close();
		
	}
}
 

