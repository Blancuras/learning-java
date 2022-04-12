package com.abril5;

public class PruebaPersona2 {

	public static void main(String[] args) {
	Persona2 persona2 = new Persona2("Juan", 5000, false);	
	
	/*System.out.println("Nombre persona: " + persona2.getNombre());
	persona2.setNombre("Carlos"); 
	System.out.println("Nombre persona: " + persona2.getNombre());
	System.out.println("Sueldo persona: " + persona2.getSueldo());
	System.out.println("Persona Borrada: " + persona2.isEliminado());*/
	
	System.out.println("persona: " + persona2.toString()); 
	
	persona2.setNombre("Carlos"); 
	persona2.setSueldo(3000); 
	persona2.setEliminado(true); 
	
	System.out.println("persona: " + persona2.toString()); 
	}

}
