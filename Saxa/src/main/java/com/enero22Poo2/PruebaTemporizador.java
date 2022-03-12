package com.enero22Poo2;

import java.awt.event.ActionListener;
import java.util.Timer;

import javax.swing.JOptionPane;

public class PruebaTemporizador {

	public static void main(String[] args) {

		DameLaHora oyente = new DameLaHora();
	//	Timer miTemporizador = new Timer(5000, oyente);
	//	miTemporizador.start();
		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para detener");
		System.exit(0);
	}

}
