package com.feb24;

public class Nutria extends Animal {

	public Nutria(String nombre, int id, int edad) { // Siempre se debe heredar el constructor
		super(nombre, id, edad); // llama a los atributos de la superclase
	}

	@Override // Hace referencia a que voy a transcribir un metodo de la clase padre que estoy
				// hredando
	public void comer() {
		System.out.println("La nutria come peces");
		System.out.println("La nombre de la nutria es: " + nombre);
		System.out.println("El id de la nutria es " + id);
		System.out.println("La edad de la nutria es " + edad);
	}

	public void nadar() {
		System.out.println("La nutria esta nadando");
	}
}
