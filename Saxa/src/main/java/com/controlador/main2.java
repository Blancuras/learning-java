package com.controlador;

import java.util.Scanner;

public class main2 {

	public static void main(String[] args) {
		int cont = 0; // creo el contador - siempre empieza en cero
		int contN = 0; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su nombre:");
		String nombre = sc.nextLine();
		System.out.println("Ingrese su edad");
		
		
		int edad = sc.nextInt(); // lectura del parametro que envia el usuario como int
		sc.nextLine(); //solicita nueva entrada de dtos
		cont++;// cuento - incremento el contador 
		
		
		int contN1 = 0;
		contN1++; 
		System.out.println("La cantidad es:" + cont); // mostrar la cuenta
		System.out.println("Ingrese su nombre:");
		String nombre2 = sc.nextLine();// lectura del parametro que envia el usuario como int
		System.out.println("Ingrese su edad");
		
		
		int edad2 = sc.nextInt();// lectura del parametro que envia el usuario como int
		cont++; 
		contN1++; 
		System.out.println("la cantidad es:" + cont); 
		System.out.println("La cantidad de nombres es:" + contN1);
	}

}
