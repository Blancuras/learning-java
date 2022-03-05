package feb10;

import javax.swing.JOptionPane;

public class Condicionales {

	public static void main(String[] args) {
		char caracter = JOptionPane.showInputDialog("Digite su caracter ").charAt(0);
		int opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Digite una opcion : \n" + "\n1.- Convertir a mayuscula \n" + "2.- Convertir a minuscula "));

		if (opcion == 1) {
			covertirAMayusculas(caracter);
		} else if (opcion == 2) {
			convertirAMinuscula(caracter);
		} else {
			JOptionPane.showMessageDialog(null, "Opcion no disponible.");
		}

	}

	private static void convertirAMinuscula(char caracter) {
		if (Character.isLowerCase(caracter)) {
			JOptionPane.showMessageDialog(null, "El caracter ya esta en minuscula");
		} else {
			char caracterMinuscula = Character.toLowerCase(caracter);
			JOptionPane.showMessageDialog(null, "El caracter convertido en minuscula es: " + caracterMinuscula);
		}
	}

	private static void covertirAMayusculas(char caracter) {
		if (Character.isUpperCase(caracter)) {
			JOptionPane.showMessageDialog(null, "El caracter ya esta en mayusculas");
		} else {
			char caracterMayuscula = Character.toUpperCase(caracter);
			JOptionPane.showMessageDialog(null, "El caracter convertido a mayuscula es: " + caracterMayuscula);
		}
	}

}
