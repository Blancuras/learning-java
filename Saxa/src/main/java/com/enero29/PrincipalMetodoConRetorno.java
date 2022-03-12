package com.enero29;

import java.util.Scanner;

public class PrincipalMetodoConRetorno {

	public static void main(String[] args) {
		MetodoConRetorno calculadora = new MetodoConRetorno(); 
		Scanner entrada = new Scanner(System.in); 
	
		System.out.println("Ingresa tus dos valores a sumar"); 
		int resultado = calculadora.suma(entrada.nextInt(), entrada.nextInt()); 
		System.out.println("Este es el resultado  = " + resultado); 
		
		System.out.println("Ingresa tus dos valores a restar"); 
		resultado = calculadora.resta(entrada.nextInt(), entrada.nextInt()); 
		System.out.println("Este es el resultado  = " + resultado);
		
		System.out.println("Ingresa tus dos valores a multiplicar"); 
		resultado = calculadora.multiplicacion(entrada.nextInt(), entrada.nextInt()); 
		System.out.println("Este es el resultado  = " + resultado);
	}

}
