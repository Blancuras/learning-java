package com.oct7;

import java.util.Scanner;

//Hacer un progra que calcule e imprima la suma de tres calificaciones
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		float nota1, nota2, nota3, suma;  
		
		//Guardamos las 3 notas
		System.out.println("Digita 3 calificaciones: "); 
		nota1 = entrada.nextFloat(); 
		nota2 = entrada.nextFloat(); 
		nota3 = entrada.nextFloat(); 
		entrada.close();

		suma = nota1 + nota2 + nota3; //sumamos las 3 notas 
		System.out.println("\nLa suma es " + suma);
		
	}

}
