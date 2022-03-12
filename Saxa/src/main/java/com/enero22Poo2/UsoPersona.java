package com.enero22Poo2;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoPersona {

	public static void main(String[] args) {
		Persona[] lasPersonas = new Persona[2]; 
		lasPersonas[0] = new Empleado2("Luis Conde", 50000, 2009, 2, 25); 
		lasPersonas[1] = new Alumno("Ana Lopez", "Biologia");
		
		for (Persona person: lasPersonas) {
			System.out.println(person.dameNombre() + ", " + person.dameDescripcion());
		}
		
 	}
}



