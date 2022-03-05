package com.oct12;

import javax.swing.JOptionPane;

/*
 * Pedir 10 numeros, y mostrar al final si se ha introducido algun negativo.
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		int numero; 
		boolean hayNegativos = false; 
		System.out.println("Son 10 numeros");
		for(int indice = 1; indice <=10; indice++) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero "+indice)); 
			
			if(numero < 0) { // si el numero es negativo 
				hayNegativos = true; 
			}
		} 
		if(hayNegativos == true) {
			System.out.println("Si existe al menos un numero negativo");
		}else {
			System.out.println("No existe ningun numero negativo");
		}
	}

}
