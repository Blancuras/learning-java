package com.enero18;

import javax.swing.JOptionPane;

public class EntradaNumeros {

	public static void main(String[] args) {
		double num12 = 20000.0545676874; 
		System.out.printf("%1.4f", num12); 
		System.out.println("\ndjkdh "+num12);
		
		String num1 = JOptionPane.showInputDialog("Introduce un numero"); 
		double num2=Double.parseDouble(num1); 
		System.out.print("La raiz de " + num2 + " es ");
		System.out.printf("%1.2f", Math.sqrt(num2));
	}

}
