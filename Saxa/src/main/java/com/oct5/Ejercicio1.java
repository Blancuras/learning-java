package com.oct5;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Rectangulo
		int ladoB = 15;
		int ladoA = 8;

		// Area
		int area = ladoB + ladoA;
		System.out.println("area rectangulo " + area);

		// Perimetro
		int perimetro = (2 * ladoB) + (2 * ladoA);
		System.out.println("Perimetro " + perimetro);

		// Area
		double area1 = ladoB * ladoA / 2;
		System.out.println("Area " + area1);

		// Cirulo
		int r = 60;

		// Area
		double pi = Math.PI;
		double circuloArea = pi * Math.pow(r, 2);
		System.out.println("Circulo area " + circuloArea);

		//Hipotenusa
		//Raiz cuadrada de la suma de los cuadrados de los catetos.
		
		// Triangulo
		ladoB = 5;
		ladoA = 3; 
		
		double sumaCatetos = Math.pow(ladoA, 2) + Math.pow(ladoB, 2); 
		double area3 = Math.sqrt(sumaCatetos); 
		
		System.out.println("Area triangulo " + area3);

	}
}
