package com.empleados;

public class TrabajadorPrincipal {
	public static void main(String[] args) {
		
	/*	//Declaracion de variables 
		Trabajador trabajador; 
		Empleado empleado; 
		Consultor consultor;  
		
		//Creacion de objetos
		trabajador = new Trabajador ("Albertina"); 
		empleado = new Empleado ("Alejandro" , 5000); 
		consultor = new Consultor ("America ", 40, 105); 
		
		//Salida de datos 
		System.out.println(trabajador);
		System.out.println(empleado); 
		System.out.println(consultor);*/ 
		
		Trabajador[] trabajadores = new Trabajador[2]; 
		
		trabajadores[0] = new Empleado("Albertina", 8000); 
		trabajadores[1] = new Consultor("Alejandro", 40, 150.00); 
		
		for(int indice = 0; indice < 2; indice++) {
			System.out.println(trabajadores[indice].calcularPaga());
		}
	}
}
