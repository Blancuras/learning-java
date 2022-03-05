package com.oct11;

import javax.swing.JOptionPane;

public class EjercicioCiclos2 {

	public static void main(String[] args) {
		int numero;

		numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero: cero para salir"));

		while (numero != 0) { // mientras el numero sea distinto de 0
			if (numero % 2 == 0) { // si el numero es par
				System.out.println("El numero " + numero + " es PAR");
			} else {
				System.out.println("El numero " + numero +" es IMPAR");
			} 
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digita otro numero: "));
		}
	}

}
