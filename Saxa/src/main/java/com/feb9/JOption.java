package com.feb9;

import javax.swing.JOptionPane;

public class JOption {

	public static void main(String[] args) {
		int numeroEntero;
		double numeroDecimal;
		float numeroFlotante;
		String cadena;
		char caracter;

		numeroEntero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
		numeroDecimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un numero decimal"));
		numeroFlotante = Float.parseFloat(JOptionPane.showInputDialog("Digite un numero flotante"));
		cadena = JOptionPane.showInputDialog("Digite una cadena");  
		caracter = JOptionPane.showInputDialog("Digite una cadena: ").charAt(0); 
		
		JOptionPane.showInputDialog(null, "El numero entero es: " + numeroEntero); 
		JOptionPane.showInputDialog(null, "El numero decimmal es: " + numeroDecimal); 
		JOptionPane.showInputDialog(null, "El numero flotante es: " + numeroFlotante); 
		JOptionPane.showInputDialog(null, "La cadena es: " + cadena); 
		JOptionPane.showInputDialog(null, "El caracter es: " + caracter); 
		
	}

}
