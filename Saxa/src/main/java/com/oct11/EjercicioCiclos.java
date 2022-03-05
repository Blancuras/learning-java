package com.oct11;

import javax.swing.JOptionPane;

/*
 * Leer un numero y mostrar su cuadrado, repetir el proceso hasta que se introduzca un
 * un numero negativo
 */
public class EjercicioCiclos {

	public static void main(String[] args) {
		int numero, cuadrado;

		numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero: "));

		while (numero >= 0) { // mientras el numero sea 0 o positivo
			cuadrado = (int) Math.pow(numero, 2);
			JOptionPane.showMessageDialog(null, "El numero " + numero + "elevado al  cuadrado es: " + cuadrado);
			numero = -1;
		}
	} 

}
