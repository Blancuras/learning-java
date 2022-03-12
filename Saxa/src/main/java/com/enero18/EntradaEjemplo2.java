package com.enero18;

import javax.swing.JOptionPane;

public class EntradaEjemplo2 {

	public static void main(String[] args) {
		String nombreUsuario = JOptionPane.showInputDialog("Introduce tu nombre");
		String edad = JOptionPane.showInputDialog("Introduce tu edad");
		int edadUsuario = Integer.parseInt(edad);
		edadUsuario++;
		System.out.println("Hola " + nombreUsuario + ". El anio que viene tendras " + (edadUsuario) + " anios");
	}

}
