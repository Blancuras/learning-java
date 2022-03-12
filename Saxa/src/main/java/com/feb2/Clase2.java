package com.feb2;

public class Clase2 {

	public static void main(String[] args) { 
		//Estamos creando instancia clase 1
		Clase1 objeto1 = new Clase1(); 
		
		objeto1.setEdad(10);  
		System.out.println("La edad es: " + objeto1.getEdad()); 
		
		objeto1.setNombre("Juan"); 
		System.out.println("El nombre es: " + objeto1.getNombre()); 
		
	} 
	
	
}
