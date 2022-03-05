package com.oct15;

import java.time.LocalDate;

//Constantes
public class Peersona {
	private String nombre; 
	private int edad; 
	private LocalDate fechaDeRegistro;

	//Contructor sin parametros
	public Peersona() {
		fechaDeRegistro = LocalDate.now();
		System.out.println("Se ejecuto constructor sin parametros");
	}
	
	//Constructor con argumentos
	public Peersona(String nombre, int edad) {
		fechaDeRegistro = LocalDate.now();
		this.nombre = nombre; 
		this.edad =edad; 
	} 
	public void mostrarDatos() {
		System.out.println("El nombre es: " + nombre);
		System.out.println("La edad es: " + edad);
		System.out.println("SE registro en "+fechaDeRegistro);
	} 
	
	public int getEdad() {
		return edad;  
	} 
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setEdad(int edad) {
		this.edad = edad; 
	} 
	
}
