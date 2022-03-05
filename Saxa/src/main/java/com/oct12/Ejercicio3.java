package com.oct12;

import javax.swing.JOptionPane;

/*
 * Pedir 10 numeros. Mostrar la media de los numeros positivos, la media de los numeros negativos
 * y la cantidad de ceros
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		int numero, sumaPositivos = 0, conteoPositivos = 0, sumaNegativos = 0, conteoNegativos = 0, conteoCeros = 0;
		float mediaPositivos;
		System.out.println("Son 9 numeros");
		for (int indice = 1; indice <= 10; indice++) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

			if (numero == 0) { // si el numero es cero
				conteoCeros++; // aumentamos en 1 el conteo de 0
			} else if (numero > 0) { // si el numero es positivo
				sumaPositivos += numero; // suma iterativa de positivos
				conteoPositivos++;
			} else { // si el numero es negativo
				sumaNegativos += numero;
				conteoNegativos++;
			}
		}

		// Tratamos con los positivos

		if (conteoPositivos == 0) {
			System.out.println("No se puede sacar la media de los positivos");
		} else {
			mediaPositivos = (float) sumaPositivos / conteoPositivos;
			System.out.println("La media de los numeros positivos es: " + mediaPositivos);
		}
		System.out.println("La cantidad de ceros es: " + conteoCeros);
		System.out.println("Suma negativos " + sumaNegativos);
		System.out.println("Conteo Negativos " + conteoNegativos);
	}

}
