package com.oct21;

import java.util.Scanner;

public class Condicionales {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float sueldo;
		System.out.println("Introduce el sueldo");
		sueldo = teclado.nextFloat();
		
		if (sueldo <= 3000) { // operador de comparacion
			System.out.println("El usuario esta excento de declarar su renta");
		}else {
			System.out.println("El usuario tiene que hacer el impuesto de la renta ");
		}
		
		if (sueldo > 6000 && sueldo < 10000) { // OPERADOR LOGICO, se tiene que cumplir las dos condiciones
			System.out.println("El usuario tiene que pagar una bonificacion de 1000");

		} else if (sueldo == 20000 || sueldo == 30000) {
			System.out.println("El usuario paga un 10 por ciento de su sueldo");
		} 
		teclado.close();
	}
}
