package feb12;

import java.util.Scanner;

public class Arreglo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int arreglo[] = new int[10];
		int posicionEliminar;

		// Llenamos arreglo
		for (int indice = 0; indice < 10; indice++) {
			System.out.println("Digite un numero en la posicion [" + indice + "]");
			arreglo[indice] = entrada.nextInt();
		}

		// Mostrar el arreglo antes de eliminar un elemento
		System.out.println("\nEl arreglo es : ");
		for (int indice = 0; indice < 10; indice++) {
			System.out.println(+arreglo[indice] + " en la posicion " + indice);
		}

		System.out.println("\nDigite la posicion del array a eliminar");
		posicionEliminar = entrada.nextInt();

		// Eliminamos el array
		for (int indice = posicionEliminar; indice < 9; indice++) {
			arreglo[indice] = arreglo[indice + 1];
		}

		// Mostramos el arreglo actual
		System.out.println("\nEl arreglo actual es : ");
		for (int indice = 0; indice < 9; indice++) {
			System.out.println(+arreglo[indice] + " en la posicion " + indice);
		}
	}

}
