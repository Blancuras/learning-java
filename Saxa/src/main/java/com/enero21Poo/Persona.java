package com.enero21Poo;

public class Persona {
	private int edad; //Atributos
	private String nombre;

	// Metodo setter: Establecemos la edad
	public void setEdad(int edad) {
		this.edad = edad;
	}

	// Metodo Get: obteniendo la edad
	public int getEdad() {
		return edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [edad=" + edad + ", nombre=" + nombre + "]";
	}
	
}
