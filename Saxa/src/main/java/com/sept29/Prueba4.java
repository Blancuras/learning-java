package com.sept29;

import java.util.Scanner;

public class Prueba4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);  
		double area, radio; 
		System.out.println("Ingresa el valor del radio"); 
		radio = entrada.nextDouble();
		area =Math.PI * Math.pow(radio, 2); 
		System.out.println("El area del circulo es: " + area);
	}
	
}
