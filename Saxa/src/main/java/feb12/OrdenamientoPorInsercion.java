package feb12;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class OrdenamientoPorInsercion {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int arreglo[];
		int numElementos;

		numElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño del arreglo"));
		arreglo = new int[numElementos];

		for (int indice = 0; indice < numElementos; indice++) {
			System.out.print("Digite un elemento en la posicion [" + indice + "]");
			arreglo[indice] = entrada.nextInt();
		}
		System.out.println("\nEl arreglo desordenado es:");
		for (int indice = 0; indice < numElementos; indice++) {
			System.out.println(arreglo[indice] + "");
		}

		// Metodo de Insercion
		int posicion; 
		int auxiliar; 
		for (int indice = 0; indice < numElementos; indice++) {
			posicion = indice; 
			auxiliar = arreglo[indice]; 
			while((posicion > 0) && (arreglo[posicion-1] > auxiliar)) {
				arreglo[posicion] = arreglo[posicion-1];
				posicion--; 
			} 
			arreglo[posicion] = auxiliar; 
		}
			//Imprimio el arreglo ordenado 
		System.out.println("");
		System.out.println("El arreglo ordenado es : ");
		for (int indice = 0; indice < numElementos; indice++) {
			System.out.println(arreglo[indice] + " ");
		}
	}
}