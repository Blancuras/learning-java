package com.oct5;

import java.util.Scanner;

//Intercambio dos valores de posicion
public class Metodos4 {

	public static void main(String[] args) {

		double numero1, numero2;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingresa el primer valor");
		numero1 = entrada.nextDouble();
		System.out.println("Ingresa el segundo valor");
		numero2 = entrada.nextDouble(); 
		
		cambiarValor(numero1, numero2); 
		entrada.close();
	}

	public static void cambiarValor(double valor1, double valor2) {
		double auxiliar; 
		auxiliar = valor1; 
		valor1 = valor2; 
		valor2 = auxiliar;  
		System.out.println("Variable 1: " + valor1); 
		System.out.println("Variable 2: " + valor2);
	}
}
