package com.oct5;
import javax.swing.JOptionPane;

public class Metodos2 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "El valor de la suma 1 es " + sumaDosNumeros());
		JOptionPane.showMessageDialog(null, "El valor de la suma 2 es " + sumaDosNumeros());
		JOptionPane.showMessageDialog(null, "El valor de la suma 3 es " + sumaDosNumeros());
		JOptionPane.showMessageDialog(null, "El valor de la suma 4 es " + sumaDosNumeros());
		JOptionPane.showMessageDialog(null, "El valor de la suma 5 es " + sumaDosNumeros());

		
	}
	
	public static double sumaDosNumeros() {
		double numero1, numero2; 
		numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el primer numero"));
		numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el segundo numero"));
		return numero1 + numero2;
	}
}
