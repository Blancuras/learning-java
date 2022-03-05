package enero19;

import javax.swing.JOptionPane;

public class AccesoAplicacion {

	public static void main(String[] args) {
		String clave = "Bebas";
		String contrasena = "";
		
		while (true) {
			contrasena = JOptionPane.showInputDialog("Introduzca la contrasena");
			if (clave.equalsIgnoreCase(contrasena)) {
				System.out.println("Contrasena correcta");
				break;
			}else {
				System.out.println("contrasena incorrecta");
			}
		}
		
	}

}
