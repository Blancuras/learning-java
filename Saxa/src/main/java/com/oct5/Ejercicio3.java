package com.oct5;

public class Ejercicio3 {

	public static void main(String[] args) {

		int totalEpisodios = 5;
		int totalTemporadas = 2;

		if (totalEpisodios >1 && totalEpisodios <= 10) {
			System.out.println("Es una mini serie");
		}else if (totalTemporadas > 1 && totalEpisodios >= 10 ) {
			System.out.println("Es una serie");
		}else if (totalEpisodios == 1) {
			System.out.println("Es una pelicula");
		} else {
			System.out.println("Debe tener al menos un episodio");
		} 
		
		int duracion = 10; 
		for(int j = 0; j <= duracion; j++) {
			if (j < 3) {
				System.out.println("Reproduciendo intro, segundo = " + j );
			}else if (j < 7) {
				System.out.println("Reproduciendo pelicula, segundo = " + j); 
				
			} else {
				System.out.println("Reproduciendo creditos, segundo = " + j);
			}
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}			
		}
	}
}
