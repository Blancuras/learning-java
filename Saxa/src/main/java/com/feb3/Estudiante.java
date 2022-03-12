package com.feb3;

public class Estudiante extends Persona{
	private int codigoEstudiante; 
	private float notaFinal;  
	
	//Constructor
	public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal){
		super(nombre, apellido, edad); //indicarle que atributos esntan inicializados dentro de clase Persona
		this.codigoEstudiante = codigoEstudiante; 
		this.notaFinal = notaFinal; 
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre: " + getNombre() + 
				"\nApellido: " + getApellido() + 
				"\nEdad: " + getEdad() + 
				"\nCodigo Estudiante: " + notaFinal);
	}
	public void mostrarDatos2() {
		System.out.println( toString() );
	}
	
	@Override
	public String toString() {
		return "Estudiante [codigoEstudiante=" + codigoEstudiante + ", notaFinal=" + notaFinal + ", "
				+ (getNombre() != null ? "\nnombre=" + getNombre() + ", " : "")
				+ (getApellido() != null ? "appellido=" + getApellido() + ", " : "") + "edad=" + getEdad()
				 + "]";
	}
	
	
}
