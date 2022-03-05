package com.oct15;

//Miembros estaticos de una clase, son los atributos y los metodos
public class Estatico {
	private final static String FRASE = "Primera frase";

	public static int sumar(int num1, int num2) {
		int suma = num1 + num2;
		return suma;
	}

	public static void main(String[] args) {
		System.out.println(FRASE);
		System.out.println("La suma es: " + sumar(3, 4)); //Ya no hace falta instanciar objetos, se puede mandar a llamar con la clase
		
		
		// objeto2.frase = "Segunda frase";
		// Estatico objeto1 = new Estatico();
		// Estatico objeto2 = new Estatico();
		// System.out.println(objeto2.frase);
	}

}
