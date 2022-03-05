package com.sept24;

public class Promedio {

	public static void main(String[] args) {
		double matematicas = 5;
		double biologia = 6;
		double quimica = 5;
		double promedio = 0;

		promedio = (matematicas + biologia + quimica) / 3;

		if (promedio >= 6.1) {
			System.out.println("El alumno aprobo " + promedio);
		} else {
			System.out.println("El alumno reprobo " + promedio);
		}
	}
}
