package com.enero20;

public class UsoArrays2 {

	public static void main(String[] args) {
		 //String[] paises = new String[8];

		/*
		 * paises[0] = "Espana"; paises[1] = "Mexico"; paises[2] = "Colombia"; paises[3]
		 * = "Peru"; paises[4] = "Chile"; paises[5] = "Argentina"; paises[6] =
		 * "Ecuador"; paises[7] = "Venezuela";
		 */

		/*
		 * for (int indice = 0; indice < paises.length; indice++) {
		 * System.out.println("Pais " + (indice + 1) + " " + paises[indice]); }
		 */
	
		String[] paises = { "Espana", "Mexico", "Colombia", "Peru", "Chile", "Argentina", "Ecuador", "Venezuela" };

		//for each 
		for (String elemento : paises) {
			System.out.println("Pais: " + elemento);
		}
		
		int[] miArreglo = { 5, 38, 15, 92, 71, 25, 95, 21, 34, 84, 24, 77, 22, };
		for (int index : miArreglo) {
			System.out.println("for each2 "+index);
		}
	}

}
