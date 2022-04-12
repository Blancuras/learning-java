package com.abril8;

public class Persona {
	private int idPersona;
	private String nombre;
	private int edad;
	private static int contadorPersonas;

	private Persona() {
		this.idPersona = ++contadorPersonas;
	}

	// Constructor Completo - sobrecarga
	public Persona(String nombre, int edad) {
		this();
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", " + (nombre != null ? "nombre=" + nombre + ", " : "") + "edad="
				+ edad + "]";
	}

}
