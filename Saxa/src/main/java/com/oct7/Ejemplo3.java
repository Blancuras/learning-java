package com.oct7;

import java.util.Scanner;

public class Ejemplo3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		char letra;
		System.out.println("Digita una letra; ");
		letra = entrada.next().charAt(0); //Guarda el  primer caracter que encuentre
		entrada.close();

		System.out.println("El String es: " + letra);
	}

}
