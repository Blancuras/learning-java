package com.oct11;

import javax.swing.JOptionPane;

public class EjercicioCiclos3 {
//Pedir numeros hasta que se introduzca uno negativo y calcular  la media.
	
	public static void main(String[] args) {
		int numero, elementos = 0, suma = 0; 
		float media; 
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero Cero para salir")); 
		
		while(numero > 0) {
			suma += numero; // suma iterativa 
			elementos ++; //aumentamos uno a elementos  
			
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero")); 
		} 
		
		if(elementos == 0) { 
			System.out.println("Error! la division entre 0 no existe"); 
		} else {
			media = (float) suma/elementos; 
			System.out.println("La media o el promedio es: " + media);
		}
	}

}
