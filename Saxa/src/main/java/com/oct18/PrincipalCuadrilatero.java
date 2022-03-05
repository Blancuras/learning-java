package com.oct18;

import javax.swing.JOptionPane;

public class PrincipalCuadrilatero {
	public static void main(String[] args) {
		Cuadrilatero cuadrilatero1;
		float lado1, lado2;

		lado1 = Float.parseFloat(JOptionPane.showInputDialog("Digites el lado 1: "));
		lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digites el lado 2: "));

		if (lado1 == lado2) { // Es un cuadrado
			cuadrilatero1 = new Cuadrilatero(lado1);
		} else {
			cuadrilatero1 = new Cuadrilatero(lado1, lado2);
		}
		System.out.println("El perimetro es: " + cuadrilatero1.getPerimetro());
		System.out.println("El area es: " + cuadrilatero1.getArea());
	}
}
