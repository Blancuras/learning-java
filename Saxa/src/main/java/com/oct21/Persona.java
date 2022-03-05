package com.oct21;

import java.util.Scanner;

public class Persona {
	private Scanner teclado;
	private String nombre;
	private int edad;

	public Persona() {
		teclado = new Scanner(System.in); // Preguntar por que es diferente
		System.out.println("Ingrese su nombre");
		nombre = teclado.next(); 
		System.out.println("Ingrese su edad");
		edad = teclado.nextInt();
	}

	public void imprimir() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
	}

	public void esMayorEdad() {
		if(edad >=18 && edad <=65) {
			System.out.println(nombre+" es mayor de edad para actividad laboral."); 
		}else if(edad >65) {
			System.out.println(nombre +" Jubilado inactivo en vida laboral.");
		}else {
			System.out.println(nombre +" No es mayor de edad, no puede entrar en actividad laboral");
		}
	} 
	
	public static void main(String[] args) {
		Persona persona1 = new Persona(); 
		persona1.imprimir(); 
		persona1.esMayorEdad(); 
	}
}
