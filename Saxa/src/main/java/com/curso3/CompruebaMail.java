package com.curso3;

import javax.swing.JOptionPane;

public class CompruebaMail {

	public static void main(String[] args) {

		int arroba = 0;
		boolean punto = false;

		String mail = JOptionPane.showInputDialog("Introduce email"); //email@hotmai.com

		for (int i = 0; i < mail.length(); i++) {
			char letra =mail.charAt(i);
			if ( letra== '@') {
				arroba++;
			}
			if ( letra == '.') {
				punto = true;
			}
		}
		
		if (arroba == 1 && punto == true) {
			System.out.println("El email es correcto");
		} else {
			System.out.println("El email no es correcto");
		}
	}
}
