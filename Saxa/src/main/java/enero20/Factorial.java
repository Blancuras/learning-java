package enero20;

import javax.swing.JOptionPane;

public class Factorial {

	public static void main(String[] args) {
		int resultado = 1;
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));

		for (int indice = numero; indice > 0; indice--) {
			resultado = resultado * indice;
		}

		System.out.println("El factorial de " + numero + " es " + resultado);
	}

}
