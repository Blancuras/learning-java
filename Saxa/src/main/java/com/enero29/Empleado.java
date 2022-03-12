package com.enero29;

public class Empleado {
	private int edad;
	private String nombre; 

	public void setEdad(int edad) {
		if (edad > 18 && edad < 80) {
			this.edad = edad;
		} else {
			System.out.println("Esta empresa no acepta empleados de esa edad");
		}
	}
	
	public int getEdad() {
		return this.edad; 
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
