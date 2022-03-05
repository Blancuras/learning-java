package com.oct15;

public class AnimalMain {
	public static void main(String[] args) {
		Animal animal1 = new Animal();

		animal1.setEdad(10);
		System.out.println("La edad es: " + animal1.getEdad()); 
		
		animal1.setNombre("Blancuras"); 
		System.out.println("El nombre es: " +animal1.getNombre()); 
		
	}
}
