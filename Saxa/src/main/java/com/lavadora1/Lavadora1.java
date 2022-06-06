package com.lavadora1;

import java.util.Scanner;

import com.libreria.FuncionesLavadora2;

public class Lavadora1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("La ropa es blanca o de color?");
		System.out.println("Presiona 1 - ropa blanca / 2 - ropa color");
		int tipoDeRopa = entrada.nextInt();

		System.out.println("Cuantos kilos de ropa?");
		int kilos = entrada.nextInt();

		FuncionesLavadora2 funcionesLavadora = new FuncionesLavadora2(kilos, tipoDeRopa);
		funcionesLavadora.setTipoDeRopa(2);
		System.out.println("El tipo de ropa es: " + funcionesLavadora.getTipoDeRopa());
		funcionesLavadora.cicloFinalizado();
	}
}
