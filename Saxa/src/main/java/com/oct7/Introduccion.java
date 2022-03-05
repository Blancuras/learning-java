package com.oct7;
import java.util.Scanner;

public class Introduccion {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); //Entrada de datos 
		int numero; 
		
		System.out.println("Digita un numero: "); 
		numero = entrada.nextInt(); //Guarda el valor entero dentro de la variable numero 
		entrada.close();
		System.out.println("El numero es " + numero);
	}

}
