package com.curso3;

public class ManipulaCadenas {

	public static void main(java.lang.String[] args) {
		
		String nombre="molly"; 
		
		System.out.println("El nombre de mi mascota es " + nombre);
		
		System.out.println("Su nombre tiene " + nombre.length() + " letras.");
		
		System.out.println("La primera letra de " + nombre + " es la " + nombre.charAt(0)); 
		
		int ultimaLetra; 
		
		ultimaLetra=nombre.length();//5 
		
		System.out.println("Y la ultima letra es la " + nombre.charAt(ultimaLetra-1));
	}

}
