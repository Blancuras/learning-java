package com.sept13;

public class Carro {
	
	private String modelo; //atributo
	private int anio;//atributo
	public static String dueno;
	
	public Carro() { //constructor sin parametros
		Contador1.numero++; 
		System.out.println("Ejecutando constructor sin parametros");
	}
	
	public Carro(int anio) { //contructor con parametro nio
		this.anio=anio; 
		Contador1.numero++; 
		System.out.println("Ejecutando constructor con parametro anio");
	}
	
	public Carro(String modelo, int anio) {
		this.modelo = modelo;
		this.anio = anio;
		Contador1.numero++;
		System.out.println("Ejecutando constructor con parametro modelo y anio");
	}

	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {//modelo variable
		this.modelo = modelo;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {//anio parametro
		this.anio = anio;
	} 

	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", anio=" + anio + ", dueno=" + dueno + "]";
	}

}
