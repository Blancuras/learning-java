package com.curso3;

import javax.swing.*;

public class EntradaEjemplo2 {

	public static void main(String[] args) {

		String nombreUsuario = JOptionPane.showInputDialog("introduce tu nombre.");

		String edad = JOptionPane.showInputDialog("Introduce la edad");
		// showInputDialog devuelve un string
		System.out.println("Hola " + nombreUsuario + ". Tienes " + edad + " años");

	}

}
