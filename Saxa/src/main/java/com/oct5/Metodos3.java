package com.oct5;

import javax.swing.JOptionPane;

public class Metodos3 {

	public static void main(String[] args) {
		double numero1, numero2; 
		for (int contador1 = 1; contador1<=5; contador1++) {
			numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el primer numero de la suma " + contador1));
			numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el segundo numero de la suma " + contador1));
			
			sumaDosNumero(numero1, numero2, contador1); 
		}
	}
	
	public static void sumaDosNumero(double numero1, double numero2, int contador1) {
		JOptionPane.showMessageDialog(null, "El valor de la suma " + contador1 +  " es: " + (numero1 + numero2));
	}
}
