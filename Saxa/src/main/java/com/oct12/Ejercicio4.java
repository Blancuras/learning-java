package com.oct12;

import javax.swing.JOptionPane;

/*
 * Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la cantidad 
 * de alumnos mayores de 18 anios, y la cantidad de alumnos que miden mas de 1.75.
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		int edad, sumaEdad = 0, conteoMayor18 = 0, contadorMayor175 = 0;
		float altura, sumaAltura = 0, mediaEdad, mediaAltura;
		System.out.println("Llena los 5 alumnos");
		for (int indice = 1; indice <= 5; indice++) {
			edad = Integer.parseInt(JOptionPane.showInputDialog("Alumno " + indice + "\nDigite su edad: "));
			altura = Float.parseFloat(JOptionPane.showInputDialog("Alumno " + indice + "\nDigite su altura: "));

			sumaEdad += edad; // suma iterativa de edades
			sumaAltura += altura; // suma iterativa de las alturas

			if (edad > 18) {
				conteoMayor18++;
			}
			if (altura > 1.75) { // si la altura es mayor a 1.75
				contadorMayor175++;
			}
		}

		mediaEdad = (float) sumaEdad / 5;
		mediaAltura = (float) sumaAltura / 5;

		System.out.println("La edad promedio es: " + mediaEdad);
		System.out.println("La estatura promedio es: " + mediaAltura);
		System.out.println("Cantidad de alumnos mayores a 18 anios: " + conteoMayor18);
		System.out.println("Cantidad de alumnos que miden mas de 1.75: " + contadorMayor175);
	}

}
