package com.oct21;
import java.util.Scanner;

public class BucleFor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); 
		int suma, indice, valor;
		suma = 0; 
		
		System.out.println("Ingrese 10 numeros");
		for(indice= 1; indice <= 10; indice++) {
			System.out.println("Ingrese valor: "); 
			valor = teclado.nextInt(); 
			suma = suma+valor; 
		} 
		System.out.println("La suma es: " + suma); 
		teclado.close();
	}

}


