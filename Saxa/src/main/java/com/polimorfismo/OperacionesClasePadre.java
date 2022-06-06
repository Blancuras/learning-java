package com.polimorfismo;

import java.util.Scanner;

public abstract class OperacionesClasePadre {
	protected int valor1, valor2;
	protected int resultado;
	Scanner entrada = new Scanner(System.in);

	public void pedirDatos() {
//		System.out.println();
		System.out.println("Dame el primer valor: ");
		valor1 = entrada.nextInt();

		System.out.println("Dame el segundo valor: ");
		valor2 = entrada.nextInt();
	}

	public abstract void operaciones();
	
	public void mostrarResutado() {
		System.out.println(resultado);
	}
}
