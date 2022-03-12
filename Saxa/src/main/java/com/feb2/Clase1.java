
//Encapsulamiento Ocultar algunos datos paraque solo se puedan acceder a ellos desde la misma clse
//Metodos Accesores(Getter y setter)
package com.feb2;

public class Clase1 {
	private int edad; 
	private String nombre; 
	
	public Clase1() {
		edad=0;
		nombre ="Chuchito";
	}
	
	public void setEdad(int edad) { //Establece un valor al atributo(la edad del usuario)
		this.edad = edad; 
	} 
	public int getEdad() { //Obtiene el valor del atributo (Mostramos la edad) 
		return edad; 
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	} 
	
}
