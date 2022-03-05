package enero19;

import javax.swing.JOptionPane;

public class CompruebaMail {

	public static void main(String[] args) {
		int esCorrecto=0; 
		boolean punto = false; 
		String email = JOptionPane.showInputDialog("Introduce email");
		//email@hotmail.com
		for (int indice = 0; indice < email.length(); indice++) {
			if (email.charAt(indice) == '@') {
				esCorrecto ++;
			}
			if (email.charAt(indice)=='.') {
				punto = true; 
			}
		}
		if (esCorrecto ==1 && punto ==true) {
			System.out.println("Es correcto");
		} else {
			System.out.println("No es correcto");
		}
	}

}
