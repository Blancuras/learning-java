package com.colecciones.listas.ejerciciolistas;

import java.util.ArrayList;
import java.util.List;

public class TestsArticulos {

	public static void main(String[] args) {
		List<Serie> listaSeries = new ArrayList<>();
		List<VideoJuego> listaVideoJuegos = new ArrayList<>();

		listaSeries.add(new Serie("El juego del calamar", 1, "accion", "Christian Ramirez"));
		listaSeries.add(new Serie("Juego de tronos", 323, "Ciencia Ficcion", "Maria Mercedez"));
		listaSeries.add(new Serie("Los Simpsons", 1, "Animacion", "Fox"));

		listaVideoJuegos.add(new VideoJuego("Plantas vs Zombies", 500, "Aventura", "EA"));
		listaVideoJuegos.add(new VideoJuego("Super Mario 3", 300, "Plataforma", "Nintendo"));
		listaSeries.add(new Serie("Donkey kong", 100, "Plataforma", "Nintendo")); 

		// Entregamos los elementos de la lista de series
		for (int indice = 0; indice < listaSeries.size(); indice++) {
			listaSeries.get(indice).entregar();
		}
		// Entregamos los elementos de la lista de VideoJuegos
		for (int j = 0; j < listaVideoJuegos.size(); j++) {
			listaVideoJuegos.get(j).entregar();
		}
		// Esta variable nos sirve para contar el numero de articulos entregados
		int entregados = 0; 

		// Devolvemos los elementos de la lista de series
		for (int indice = 0; indice < listaSeries.size(); indice++) {
			if (listaSeries.get(indice).comprobarSiElArticuloEsEntregado()) {
				entregados++;
				listaSeries.get(indice).devolver();
			}
		}

		// Devolvemos todos los elementos de la lista de video juegos
		for (int f = 0; f < listaVideoJuegos.size(); f++) {
			if (listaVideoJuegos.get(f).comprobarSiElArticuloEsEntregado()) {
				entregados++;
				listaVideoJuegos.get(f).devolver();  
			}
		}
		System.out.println("Hay " + entregados + " articulos entregados.");
		System.out.println("");

		Serie serieMayor = listaSeries.get(0);
		VideoJuego videoJuegoMayor = listaVideoJuegos.get(0);

		// hayamos el mayor elemento de la lista de series
		for (int indice = 0; indice < listaSeries.size(); indice++) {
			if (listaSeries.get(indice).compareTo(serieMayor) == Serie.MAYOR) {
				serieMayor = listaSeries.get(indice);
			} 
		}

		// Hallamos el mayor elemento de la lista de videoJuegos
		for (int indice = 0; indice < listaVideoJuegos.size(); indice++) {
			if (listaVideoJuegos.get(indice).compareTo(videoJuegoMayor) == Serie.MAYOR) {
				videoJuegoMayor = listaVideoJuegos.get(indice);
			}
		}

		//hayamos la serie con menos temporadas
		Serie serieMenor = listaSeries.get(0);
		VideoJuego videoJuegoMenor = listaVideoJuegos.get(0);

		for (int indice = 0; indice < listaSeries.size(); indice++) {
			if (listaSeries.get(indice).compareTo(serieMenor) == Serie.MENOR) {
				serieMenor = listaSeries.get(indice);
			}
		}

		//hayamos el videojuego con menos horas
		for (int indice = 0; indice < listaVideoJuegos.size(); indice++) {
			if (listaVideoJuegos.get(indice).compareTo(videoJuegoMenor) == Serie.MENOR) {
				videoJuegoMenor = listaVideoJuegos.get(indice);
			}
		}
		
		System.out.println("Articulos mayores: "); 
		System.out.println("-------------------"); 
		
		System.out.println(serieMayor);
		System.out.println(""); 
		System.out.println(videoJuegoMayor); 
		
		System.out.println(""); 
		System.out.println(""); 
		
		System.out.println("Articulos menores: "); 
		System.out.println("-------------------"); 
		
		System.out.println(""); 
		System.out.println(serieMenor); 
		System.out.println(""); 
		System.out.println(videoJuegoMenor);
		
	}
}
