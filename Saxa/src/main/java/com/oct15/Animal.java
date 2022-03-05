//Encapsulamiento y metodos accesores 
//Encapsulamiento: Ocultar algunos datos para que no cualquiera pueda modificarlos 
//MetodosAccesores:(Getters y Setters) set: establecer get: obtener o mostrar

package com.oct15;

public class Animal {
	private int edad; // Al Estar de tipo privado el atributo solo puede ser accedido desde metodos de
	private String nombre;
	
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void mostrar() {
		System.out.println("Nombre "+ nombre + " edad "+ edad);
	}

}
