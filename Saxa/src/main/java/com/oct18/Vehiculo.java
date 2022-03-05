/*
 * Construir un programa que dada una serie de vehiculos caracterizados por su marca, modelo y
 * precio, imprima las propiedades del vehiculo mas barato. para ello, se deberan leer por 
 * teclado las caracteristicas de cada vehiculo y crear una clase que represente a cada uno 
 * de ellos.
 */
package com.oct18;

public class Vehiculo {
	//private  Modificador de acceso
	//String tipo de dato
	//Nombre de la variable
	private String marca;
	private String modelo;
	private float precio;

	// Contructor
	public Vehiculo(String marca, String modelo, float precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	public float getPrecio() {
		return precio;
	}

	public String mostrarDatos() {
		return "Marca: " + marca + "\n Modelo: " + modelo + "\nPrecio: $" + precio + "\n";
	}

}
