package feb12;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MetodoBurbuja {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int arreglo[]; 
		int numElementos; 
		
		numElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos"));
		arreglo = new int [numElementos]; 
		
		for(int iterador = 0; iterador < numElementos; iterador++) {
			System.out.println("Digite un elemento en la posicion["+ iterador +"] : ");
			arreglo[iterador] = entrada.nextInt(); 
		} 
		System.out.println("\nEl arreglo actual es: "); 
		for(int iterador = 0; iterador <numElementos; iterador++) {
			System.out.println(arreglo[iterador] + " ");
		} 
		
		//Metodo Burbuja 
		int auxiliar; 
		for(int indice = 0; indice < (numElementos - 1); indice++) { // pone la cantidad de vueltAS 
			for(int iterador = 0; (iterador < numElementos-1); iterador++){// ordena la cantidad de elementos
				if(arreglo[iterador] > arreglo[iterador + 1]) {
					auxiliar = arreglo[iterador]; 
					arreglo[iterador] = arreglo[iterador+1]; 
					arreglo[iterador + 1] = auxiliar; 
				}
			}
			
		} 
		//Imprimimos el arreglo ordenado 
		System.out.println("\nEl arreglo ordenado es ");
		for(int indice = 0; indice < numElementos; indice++) {
			System.out.println(arreglo[indice] +  " ");
		}
	}

}
