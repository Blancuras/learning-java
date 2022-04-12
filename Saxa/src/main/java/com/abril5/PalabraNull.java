package com.abril5;

public class PalabraNull {
	public static void main(String[] args) {
		Persona persona1 = new Persona("Juan");
		System.out.println("persona1: " + persona1.obtenerNombre());

		Persona persona2 = persona1;
		System.out.println("persona2: " + persona2.obtenerNombre());

		persona1 = null;
		if (persona1 == null) 
			System.out.println("La variable persona1 no apunta a ningun objeto");
		 else {
			 System.out.println("Persona1: " + persona1.obtenerNombre());
		} 
		
		System.gc();
	}
}
