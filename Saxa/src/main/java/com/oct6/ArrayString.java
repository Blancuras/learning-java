package com.oct6;

public class ArrayString {

	public static void main(String[] args) {
		String[] nombrePeliculas = new String[] { "Up", "Titanic", "Aladdin", "Pepe el toro ", "Avengers", "Matrix " };

		for (String titulo : nombrePeliculas) {
			if (!titulo.contains("i")) { // !negar Muestra peliculas qu no tengan i
				System.out.println(titulo);
			}
		}

	}

}
