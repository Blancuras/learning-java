package com.enero21Poo;

public class PruebaCrearPersona {

	public static void main(String[] args) {
		Persona persona1 = new Persona();  
		
		persona1.setEdad(10); 
		System.out.println("La edad es: " + persona1.getEdad());  
		
		persona1.setNombre("Bebas"); 
		System.out.println("El nombre es " + persona1.getNombre());
	}

}
