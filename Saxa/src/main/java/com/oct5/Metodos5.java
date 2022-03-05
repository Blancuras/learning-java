package com.oct5;

import javax.swing.JOptionPane;

import com.oct6.Metodo;

public class Metodos5 {

	public static void main(String[] args) {
		double catetoOpuesto, catetoAdyacente, hipotenusa;
		catetoOpuesto = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor del cateto opuesto"));
		catetoAdyacente = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor del cateto adyacente"));

		hipotenusa = calculoHipotenusa(catetoOpuesto, catetoAdyacente);
		JOptionPane.showMessageDialog(null, "El valor de la Hipotenusa es " + hipotenusa);
		Metodo.mihail();
	}

	public static double calculoHipotenusa(double catetoOpuesto, double catetoAdyacente) {
		return Math.sqrt(Math.pow(catetoAdyacente, 2) + Math.pow(catetoAdyacente, 2));
	}
}
