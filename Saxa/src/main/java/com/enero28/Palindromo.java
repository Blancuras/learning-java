package com.enero28;

import javax.swing.JOptionPane;

public class Palindromo {

	public static void main(String[] args) {
			String texto = JOptionPane.showInputDialog("Escribe un palindromo"); 
			int longitud = texto.length(); 
			char [] letras = new char[longitud]; 
			char [] letrasInversas = new char[longitud]; 
			int inverso = longitud; 
			boolean igual = true; 
			
			for(int indicador = 0; indicador < longitud; indicador++) {
				letrasInversas[indicador] = texto.toLowerCase().charAt(inverso-1); 
				inverso--; 
				letras[indicador]= texto.toLowerCase().charAt(indicador);
				if(letrasInversas [indicador] != letras[indicador]) {
					igual = false;  
					break; 
				}
			} 
			
			if(igual) {
				System.out.println("Es un palondromo");
			} else {
				System.out.println("No es un palindromo");
			}
			
			

	}

}
