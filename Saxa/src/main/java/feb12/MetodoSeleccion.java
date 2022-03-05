package feb12;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MetodoSeleccion {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int arreglo[];
		int numElementos;

		numElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos que desea "));
		arreglo = new int[numElementos];

		for (int indice = 0; indice < numElementos; indice++) {
			System.out.println("Digite un elemento en la posicion [" + indice + "] : ");
			arreglo[indice] = entrada.nextInt();
		}
		System.out.println("\nEl arreglo desordenado es : ");
		for (int indice = 0; indice < numElementos; indice++) {
			System.out.println(arreglo[indice] + "");
		}
		System.out.println("");

		// Metodo de seleccion
		int minimo;
		int auxiliar;
		for (int indice = 0; indice < numElementos; indice++) {
			minimo = indice; //guarda el primer elemento
		for(int iterador = indice + 1; iterador < numElementos; iterador++) {
			if(arreglo[iterador] < arreglo[minimo]) {
				minimo = iterador; 
			}
		}
			auxiliar = arreglo[indice]; 
			arreglo[indice] = arreglo[minimo]; 
			arreglo[minimo] = auxiliar; 
		} 
		//Imprimir el arreglo  
		System.out.println("El arreglo ordenado es : ");
		for (int indice = 0; indice < numElementos; indice++) {
			System.out.println(arreglo[indice] + " ");
		}
	}

}
