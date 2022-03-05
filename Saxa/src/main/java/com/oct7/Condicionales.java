package com.oct7;

import javax.swing.JOptionPane;

public class Condicionales {

	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: ")); 
		
		if (numero == 5) {
			JOptionPane.showMessageDialog(null, "El numero  es 5");
		}else {
			JOptionPane.showInputDialog(null, "El numero es diferente de 5"); 
		}
		
	}

}
