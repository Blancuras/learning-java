package com.oct4;

import java.util.Calendar;
import java.util.Scanner;

public class EntradaDatos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nombre;
		int nacimiento, edad;
		int anioActual =Calendar.getInstance().get(Calendar.YEAR);
		int diaActual =Calendar.getInstance().get(Calendar.DAY_OF_MONTH);

		System.out.println(diaActual);
		System.out.println("Ingresa tu nombre");
		nombre = entrada.nextLine();
		System.out.println("Ingresa tu anio de nacimiento");
		nacimiento = entrada.nextInt();

		edad = anioActual - nacimiento;
		System.out.println("Hola, " + nombre + " el anio de nacimiento es: " + nacimiento + ", tu edad es: " + edad);

	}

}
