package com.marzo;

public class PersonaReferencia {
	private String nombre;
	
	
	public String obtenerNombre() {
		return  this.nombre; 
	} 
	
	public void cambiarNombre(String nuevoNombre) {
		this.nombre = nuevoNombre;
	}
}
