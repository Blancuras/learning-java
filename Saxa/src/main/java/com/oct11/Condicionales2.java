package com.oct11;

import javax.swing.JOptionPane;

/*
 * Construir un programa que simule el fucionamiento de una calculadora. 
 * el usuario debe especificar la operacion con el primer caracter del primer parametro 
 * de la linea de comandos: s para la suma, r para la resta, m para la multiplicacion
 * y d para la division.
 */
public class Condicionales2 {

	public static void main(String[] args) {
		int numero1, numero2, suma, resta, multiplicacion, division;
		char operacion;

		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero: "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero: "));

		operacion = JOptionPane.showInputDialog("Digite la operacion que desea realizar: \n'S' Suma\n 'R' Resta \n 'M' multiplicacion \n 'D' Division").charAt(0);

		switch (operacion) {
		case 's':
		case 'S':
			suma = numero1 + numero2;
			JOptionPane.showMessageDialog(null, "La suma es: " + suma);
			break;
		case 'r':
		case 'R':
			resta = numero1 - numero2;
			JOptionPane.showMessageDialog(null, "La resta es: " + resta);
			break; 
		case 'm': 
		case 'M': 
			multiplicacion = numero1 * numero2; 
			JOptionPane.showMessageDialog(null, "La multiplicacion es: " + multiplicacion); 
			break; 
		case 'd': 
		case 'D': 
			division = numero1 / numero2; 
			JOptionPane.showMessageDialog(null, "La division es: " + division); 
		default: JOptionPane.showMessageDialog(null, "Error, se equivoco de operacion");
		}

	}

}
