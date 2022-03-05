package com.oct15;

public class Persona {

		//Atributos 
		private String nombre; 
		private int edad; 
		
		//Metodo Costructor
		public Persona(String nombre, int edad) {
			if (edad >= 0) {
				this.edad = edad; 
			}
			this.nombre = nombre;   //this. es el atributo
		} 
		
		public void correr() {
			System.out.println("Soy " +nombre+", tengo " +edad+ " años y me gusta correr");
		} 
		
		public void correr(int km) {
			System.out.println("He corrido " +km+ " Kilometros");
		}
	}


