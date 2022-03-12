package com.feb16;

public class Personas {
	
//	public Personas() {
//		
//	}
	
	public void comprobarSiEsMayorDeEdad(int edad, String nombre, float altura) {
		if (edad >= 18) {
			System.out.println("El ciudadano " + nombre + " es mayor de edad, Cuenta con una altura de: " + altura);

		} else {
			System.out.println(""); 
			System.out.println("El ciudadano " + nombre + " no es mayor de edad,  Cuenta con una altura de: " + altura);
		}
	}
}
