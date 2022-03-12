package com.enero27;

import javax.swing.JOptionPane;

public class JOption {

	public static void main(String[] args) {
		String cadena = JOptionPane.showInputDialog(null, "Esta es tu cadena ");
		JOptionPane.showMessageDialog(null, "Esta es tu cadena " + cadena);

		int entero = Integer.parseInt(JOptionPane.showInputDialog("Mete un entero "));
		JOptionPane.showMessageDialog(null, "Este es tu entero" + entero);

		float flotante = Float.parseFloat(JOptionPane.showInputDialog("Mete un flotante "));
		JOptionPane.showInputDialog(null, "Este es tu flotante " + flotante);
		
		double doble = Double.parseDouble(JOptionPane.showInputDialog("Mete un doble "));
		JOptionPane.showInputDialog(null, "Este es tu numero doble " + doble);
	}

}
