package com.oct5;
import javax.swing.JOptionPane;

public class Metodos {
//Nosolicita parametros y no retorna valores
	public static void main(String[] args) {
		
		sumaDosNumeros(); // se ejecuta 5 veces
	}

	public static void sumaDosNumeros() {
		double numero1, numero2;
		numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el primer numero"));
		numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el segundo numero"));
		JOptionPane.showMessageDialog(null, "El valor de la suma es: " + (numero1 + numero2));
	}

}
