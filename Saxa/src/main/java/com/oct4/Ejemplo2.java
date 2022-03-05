package com.oct4;

public class Ejemplo2 {

	public static void main(String[] args) {
		String variable = "Hola Molly, estoy programando en Java"; 
		System.out.println(variable); 
		System.out.println("El texto tiene " + variable.length() + " letras.");
		System.out.println("La frase comienza con la letra " + variable.charAt(0));
		System.out.println("La frase termina con la letra " + variable.charAt(variable.length()-1));
	}

}
