package com.feb16;

import java.util.Scanner;

public class OperacionDos {
	private int primerNumero;
	private int segundoNumero;
	private int suma;
	private int resta;
	private int multiplicacion;

	public void pedirNumeros() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("");

		System.out.println("Digite el primer numero: ");
		primerNumero = entrada.nextInt();

		System.out.println("Digite el segundo numero: ");
		segundoNumero = entrada.nextInt();

	}

	public void mostrarMenu() {
		Scanner entrada = new Scanner(System.in);
		int opcion = 0;

		System.out.println("1.- Suma numeros");
		System.out.println("2.- Restar numeros");
		System.out.println("3.- Multiplicar numeros");
		System.out.println(" 4.- Digite una accion: ");
		opcion = entrada.nextInt(); 

		switch (opcion) {
		case 1:
			pedirNumeros(); // Preguntarle a mi amorcito
			sumarNumeros();
			break;
		case 2:
			pedirNumeros();
			restarNumeros();
			break;
		case 3:
			pedirNumeros();
			multiplicarNumeros();
			break;
		default:
			System.out.println("");
			System.out.println("Opcion no disponible");
			break;
		}
	}

	public void sumarNumeros() {
		suma = primerNumero + segundoNumero;
		System.out.println("");
		System.out.println("La suma de los numeros es: " + suma);

	}

	public void restarNumeros() {
		resta = primerNumero - segundoNumero;
		System.out.println("");
		System.out.println("La resta de los numeros es: " + resta);

	}

	public void multiplicarNumeros() {
		multiplicacion = primerNumero * segundoNumero;
		System.out.println("");
		System.out.println("La multiplicacion de los numeros es : " + multiplicacion);
	}

}
