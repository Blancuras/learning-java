package com.rambo;

public class RamboMejorado { //nombre de la clase 

	private String nombre; //Variable de intancia
	private int balas=0;//Vaiable de instancia
	private static int balasEstaticas=20;//Variable de clase
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void dispararBalas() {
		balas++; 
		balasEstaticas++;
		System.out.println(nombre+ " Balas disparadas " + balas+ " estaticas "+balasEstaticas);
		
	}
	
	public static void dispararBalasEstaticas() {
		balasEstaticas++;
		System.out.println("---------Balas estaticas Disparadas " + balasEstaticas); 
	}
	
	
}
