/*
 * Desarrollar un programa que permita cargar n numeros enteros y luego nos 
 * informe cuantos valores fueron pares y cuantos impares. 
 */
package feb10;

import java.util.Scanner;

public class ContarNum {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numElementos;
		int contadorPares = 0;
		int contadorImpares = 0;
		int iterador = 0;
		int valor;

		System.out.println("Digite la cantidad de elementos que desea: ");
		numElementos = entrada.nextInt();

		while (iterador < numElementos) {
			System.out.println("Digite el elemento numero " + iterador + " : ");
			valor = entrada.nextInt();

			if (valor % 2 == 0) {
				contadorPares++; //
			} else {
				contadorImpares++;
			} 
			iterador++;
		}

		System.out.println("");
		System.out.println("La cantidad de elemntos pares son " + contadorPares);
		System.out.println("La cantidad de elementos impares son " + contadorImpares);
	}

}
