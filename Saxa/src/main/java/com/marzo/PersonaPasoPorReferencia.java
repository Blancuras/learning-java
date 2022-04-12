package com.marzo;

public class PersonaPasoPorReferencia {
	public static void main(String[] args) {
		PersonaReferencia persona = new PersonaReferencia(); 
		persona.cambiarNombre("Juan"); 
		System.out.println("Valor nombre: " + persona.obtenerNombre()); 
		
		modificarPersona(persona);
		System.out.println("Valor Nombre Modificado: " + persona.obtenerNombre());
	}

	private static void modificarPersona(PersonaReferencia personaArg) {
		personaArg.cambiarNombre("Alejandro"); 
	}
}
