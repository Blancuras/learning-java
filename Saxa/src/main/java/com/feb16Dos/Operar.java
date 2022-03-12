package com.feb16Dos;

import java.util.Scanner;

public class Operar {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Numeros numero = new Numeros();
		int primerValor;
		int segundoValor;
		int tercerValor;

		System.out.println("Digite el primer valor ");
		primerValor = entrada.nextInt();

		System.out.println("Digite el segundo valor ");
		segundoValor = entrada.nextInt();

		System.out.println("Digite el tercer valor ");
		tercerValor = entrada.nextInt();

		int mayor = numero.calcularMayorNumero(primerValor, segundoValor, tercerValor);
		int menor = numero.calcularMenorNumero(primerValor, segundoValor, tercerValor);

		System.out.println("El numero mayor es: " + mayor);
		System.out.println("El numero menor es: " + menor);
	}
}
