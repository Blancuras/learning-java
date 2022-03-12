package com.feb16;

import java.util.Scanner;

public class CalculadoraEdad {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Personas persona = new Personas(); 
		int edad; 
		float altura; 
		String nombre; 
		
		System.out.println("Digite su edad: "); 
		edad = entrada.nextInt(); 
		
		System.out.println("Digite su nombre: ");
		nombre = entrada.next(); 
		
		System.out.println("Digite su altura: "); 
		altura = entrada.nextFloat();  
		
		persona.comprobarSiEsMayorDeEdad(edad, nombre, altura);
	}

}
