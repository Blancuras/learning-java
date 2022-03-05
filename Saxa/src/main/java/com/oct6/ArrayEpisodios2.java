package com.oct6;

public class ArrayEpisodios2 {

	public static void main(String[] args) {
		int[] episodioDuracion = new int[] { 30, 32, 27, 31, 60 };
		int numero = episodioDuracion.length;

		int duracionTemporada = 0; //contendra al final la suma de todos los valores del arreglo
		for (int indice = 0; indice < numero; indice++) {
			duracionTemporada += episodioDuracion[indice];
		}
		System.out.println("Duracion de capitulos " + duracionTemporada);
	}
}