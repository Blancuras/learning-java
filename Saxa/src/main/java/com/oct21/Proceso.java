package com.oct21;

import java.util.Scanner;

public class Proceso {
	public void introducir() {
		Scanner dato = new Scanner(System.in);
		int numero;
		do {
			System.out.println("Introducir numero: ");
			numero = dato.nextInt();
			if (numero != -1) {
				producir(numero);
			} 
		} while (numero != -1);
		
		dato.close();
	}

	public void producir(int num) {
		for (int x = num; x <= 10; x ++) {
			System.out.print(x + "-");
		}
	}

	public static void main(String[] args) {
		Proceso tabla;
		tabla = new Proceso();
		tabla.introducir();
	}

}
