package com.enero28;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Escalera {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String texto = JOptionPane.showInputDialog("Humanito dame la altura de tu escalera");
		int altura = Integer.parseInt(texto);
		
		for (int numAsterisco = 1; numAsterisco <= altura; numAsterisco++) {

			for (int iteracion = 0; iteracion < numAsterisco; iteracion++) { //***
				System.out.print("*");
			}
			System.out.println("");
		} 
		entrada.close();

	}

}
