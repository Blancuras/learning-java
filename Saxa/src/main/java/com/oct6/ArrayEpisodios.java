package com.oct6;

import java.util.Scanner;

public class ArrayEpisodios {

	public static void main(String[] args) {
		System.out.println("Escribe el numero de episodio que quieras saber su duracion");
		Scanner entrada = new Scanner(System.in);
		int episodio = entrada.nextInt();
		entrada.close();
		episodio--; // se le resta 1 al valor

		int[] duracionDeTodosLosEpisodios = new int[] { 30, 32, 27, 31, 60 };
		int numero = duracionDeTodosLosEpisodios.length;

		if (episodio >= 0 && episodio < 5) {
			int duracionDeEpisodio = duracionDeTodosLosEpisodios[episodio];
			System.out.println("El episodio dura " + duracionDeEpisodio + " minutos ");
		} else {
			System.out.println("Error la serie solo tiene " + numero + "  episodios. ");
		}
	}
}
