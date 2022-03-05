package com.oct11;

import javax.swing.JOptionPane; 

/*
 * Hacer un programa que simule un cajero automatico con un saldo inicial de 1000 Dolares, 
 * con el siguiente menu de opciones: 
 * 1. Ingresar dinero a la cuenta 
 * 2. Retirar dinero de la cuenta 
 * 3. Salir 
 */
public class Condicionales3 {

	public static void main(String[] args) {
		final int saldoInicial = 1000;
		int opcion;
		float ingreso, saldoActual, retiro;

		opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su cajero automatico\n"
				+ "1. Ingresar dinero a la cuenta\n" + "2. Retirar dinero de la cuenta\n" + "3. Salir"));

		switch (opcion) {
		case 1: 
			ingreso = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad que desea ingresar en cuenta"));
			saldoActual = saldoInicial + ingreso;
			JOptionPane.showMessageDialog(null, "Dinero en cuenta: " + saldoActual);
			break;
		case 2:
			retiro = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad que desea retirar: "));
			if (retiro > saldoInicial) {
				JOptionPane.showMessageDialog(null, "No cuenta con el saldo suficiente para este retiro");
			} else {
				saldoActual = saldoInicial - retiro;
				JOptionPane.showMessageDialog(null, "Dinero en cuenta: " + saldoActual);
			}
			break; 
		case 3: break; 
		default: JOptionPane.showMessageDialog(null, "Se equivoco de opcion de menu"); break; 
		}

	}

}
