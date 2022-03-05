package com.oct7;

import javax.swing.JOptionPane;

//Entrada y salida de datos con JoptionPane
public class EntradaYSalidaDeDatos {

	public static void main(String[] args) {
		String cadena;
		int numero;
		char letra;
		double decimal;

		cadena = JOptionPane.showInputDialog("Digite una cadena"); // Guarda un String
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero")); // Tranforma la cadena en tipo
																					// entero Integer.parseInt
		letra = JOptionPane.showInputDialog("Digita un caracter: ").charAt(0); // convierte un String a char
		decimal = Double.parseDouble(JOptionPane.showInputDialog("Digita un decimal")); // Transforma una cadena a
																						// decimal
		JOptionPane.showInputDialog(null, "La cadena es " + cadena); 
		JOptionPane.showInputDialog(null, "El numero entero es: " + numero); 
		JOptionPane.showInputDialog(null, "El caracter es: " + letra); 
		JOptionPane.showInputDialog(null, "El decimal es: " + decimal); 
	}

}
