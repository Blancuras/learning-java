package com.enero28;

import java.util.Scanner;

public class Saludo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Saludame Por favor");
		String respuesta = entrada.nextLine();
		if (respuesta.equalsIgnoreCase("Hola")) {
			System.out.println("Como estas?");
		} else {
			System.out.println("No te entiendo");
		} 
		entrada.close();
	}

}
