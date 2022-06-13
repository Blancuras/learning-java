package com.oct19;

//Atributos
public class Estudiante extends Persona {
	private int codigoEstudiante;
	private float notaFinal;

	// Constructor
	public Estudiante(String nombre,String apellido,int edad,int codigoEstudiante, float notaFinal) {
		super(nombre, apellido, edad); 
		this.codigoEstudiante = codigoEstudiante; 
		this.notaFinal = notaFinal; 
	} 
	public void mostrarDatos() {
		super.soyp();
		System.out.println("Nombre: " +getNombre() +
				"\nApellido: " + getApellido() + 
				"\nEdad: " + getEdad() + 
				"\nCodigo Estudiante " + codigoEstudiante + 
				"\nNota fina: " +notaFinal);
	}
	@Override
	public String toString() {
		return "Estudiante [ codigoEstudiante=" + codigoEstudiante + ", notaFinal=" + notaFinal + "]";
	}
	
	
}
