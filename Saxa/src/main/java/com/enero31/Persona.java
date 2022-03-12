package com.enero31;

public class Persona {
	private int dinero; 
	private final String nombre; 
	
	public Persona(String nombre) {
		this.nombre = nombre; 
	}

	public String getNombre() {
		return nombre;
	}

	public int getDinero() {
		return dinero;
	}

	public void setDinero(int dinero) {
		this.dinero = dinero;
	}

	@Override
	public String toString() {
		return "Persona [dinero=" + dinero + ", " + (nombre != null ? "nombre=" + nombre : "") + "]";
	}
	
	
}
