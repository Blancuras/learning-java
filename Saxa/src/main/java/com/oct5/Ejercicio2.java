package com.oct5;

public class Ejercicio2 {

	public static void main(String[] args) {
		int totalEpisodios = 12;
		if (totalEpisodios > 1) {
			System.out.println("Es una serie");
		} else if (totalEpisodios == 1) {
			System.out.println("Es una pelicula");
		} else {
			System.out.println("Debe tener al menos un episodio");
		}
	}

}
