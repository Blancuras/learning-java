package com.enero9;

public class Pruebas1 {

	public static void main(String[] args) {
		char caracter = 78;
		System.out.println("Hola  "+caracter);
		
		//primitivo
		int edad = 12;
		edad ++; 
		edad = edad +1;
		System.out.println("edad " + edad);
		edad --; 
		System.out.println("Edad "+ edad);
		
		int year = 2022;
		year += 10; // year = year +10;
		System.out.println("year " + year);
		
		int mes = 12; 
		System.out.println("Comparacion mes "+   (mes == 12)   );
		System.out.println("diferente mes "+   (mes != 4)   ); 
		System.out.println("mayor mes "+   (mes > 4)   ); 
		System.out.println("menor mes "+   (mes  <100)   );
		System.out.println("mayor igual mes "+   (mes  >=12)   );
		
		
		 
	}

}
