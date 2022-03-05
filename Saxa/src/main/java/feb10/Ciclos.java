/*
 * Desarrolar un programa que solicite la crga de 10 numeros e imprima la suma de 
 * los ultimos 5 valores ingresados
 */
package feb10;

import java.util.Scanner;

public class Ciclos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int iterador = 0;
		int valor;
		int suma = 0;

		while (iterador < 10) {
			System.out.print("Digite un numero: ");
			valor = entrada.nextInt();

			if (iterador > 4) {
				suma = suma + valor;
			}
			iterador++;
		}

		System.out.println("");
		System.out.println("La suma de los ultimos valores es: " + suma);

	}

}
