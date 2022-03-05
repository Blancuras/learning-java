package com.sept29;

import java.util.Scanner;
//obtener el ultimo digito de un numero

public class Ejercicio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num, ultimoDigito;
		System.out.println("Ingresa un numero: ");
		num = entrada.nextInt();
		ultimoDigito = num % 10; //residuo
		System.out.println("El ultimo digito es: " + ultimoDigito);

	}

}
