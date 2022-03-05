package com.oct19;

public class VehiculoTuismo extends Vehiculo{ 
	private int numPuertas; 
	
	public VehiculoTuismo(int numPuertas, String matricula, String marca, String modelo) {
		super(matricula, marca, modelo); 
		this.numPuertas = numPuertas; 
	}
	public int getnumPuertas() {
		return numPuertas; 
	} 
	
	public String mostrarDatos() {
		return "Matricula: " + matricula + "\nMarca: " + marca + "\nModelo: " + modelo + 
				"\nNumPuertas: " + numPuertas;
	}
}
