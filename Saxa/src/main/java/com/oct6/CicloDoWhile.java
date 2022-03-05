package com.oct6;

public class CicloDoWhile {

	public static void main(String[] args) throws InterruptedException {
		int indice = 0;
		int duracion = 10;
		do {
			if (indice < 3) {
				System.out.println("Reproduciendo intro, segundo = " + indice);
			} else if (indice < 7) {
				System.out.println("Reproduciendo pelicula, segundo = " + indice);
			} else {
				System.out.println("Reproduciendo creditos, segundo = " + indice);
			}
			indice++;
			Thread.sleep(1000);
		} while (indice <= duracion);

	}
}
