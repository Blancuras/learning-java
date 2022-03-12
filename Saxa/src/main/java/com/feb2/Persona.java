package com.feb2;

public class Persona {
	// Atributos
	String nombre;
	int edad;
	String ine;

	// Constructor
	public Persona(String nombre, int edad) { // Sobrecarga de constructores
		this.nombre = nombre;
		this.edad = edad;
	}

	public Persona(String ine) {
		this.ine = ine;
	}

	public Persona() {
		
	}
	
	public void correr() {
		System.out.println("Soy " + nombre + ", tengo " + edad + " anios y estoy corriendo una maraton");
	} 
	
	public void correr(int km) {
		System.out.println("He corrido " + km + " kilometros");
	}
	
	public void correr(String km) { //Sobrecarga
		System.out.println("He corrido " + km + " kilometros");
	}
}
