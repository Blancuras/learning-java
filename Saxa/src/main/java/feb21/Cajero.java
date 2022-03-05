package feb21;

import javax.swing.JOptionPane;

public class Cajero {
	public int saldo = 90000;
	public String contrase�a = "holamundo";

	// Metodo para mostrar el menu principal
	public void mostrarMenu() {
		int opcion = 0;
		do {
			String cadena = JOptionPane.showInputDialog(null, "" + "1.-Consultar saldo\n" + "2.- Depositar\n"
					+ "3.- Retirar\n" + "4.- Cambiar clave\n" + "5.- Salir");

			if (cadena != null && ValidacionNumero.isNum(cadena)) {
				opcion = Integer.parseInt(cadena);
				switch (opcion) {
				case 1:
					consultarsaldo();
					break;

				case 2:
					depositar();
					break;

				case 3:
					retirar();
					break;

				case 4:
					cambiarClave();
					break;

				// salir
				case 5:
					JOptionPane.showMessageDialog(null, "Gracias por su atencion");
					break;

				default:
					JOptionPane.showInputDialog(null, "Opcion no disponible, vuleva a digitar");
					break;
				}
			}

		} while (opcion != 5);
	}

	// Creamos el metodo para depositar
	public void depositar() {
		String cadena;
		int deposito = 0;

		cadena = JOptionPane.showInputDialog(null, "Digite la cantidad que desea consignar");
		if (cadena != null && !cadena.equals("") && ValidacionNumero.isNum(cadena))
			;
		deposito = Integer.parseInt(cadena);

		if (deposito > 0) {
			saldo += deposito;
			JOptionPane.showMessageDialog(null, "El saldo actual es: " + saldo);
		} else {
			JOptionPane.showMessageDialog(null, "Digte una cantidad mayor a 0 ");
		}
	}

	// Metodo para retirar
	public void retirar() {
		String cadena;
		cadena = JOptionPane.showInputDialog(null, "Digite su clave");

		if (cadena == null) {
			// vuelve a la ventana de inicio
		} else {
			if (!cadena.equals("")) {
				if (cadena.equals(contrase�a)) {
					cadena = JOptionPane.showInputDialog(null, "" + "a)5000\n" + "b)10 000\n" + "c)20 000\n"
							+ "d)50 000\n" + "e)100 000\n" + "f)Otra cantidad");

					if (cadena != null) {
						if (!cadena.equals("")) {
							switch (cadena) {
							case "a":
								if ((saldo - 5000) >= 10000) {
									saldo -= 5000;
									JOptionPane.showMessageDialog(null, "El saldo actual es: " + saldo);
								}
								break;

							case "b":
								if (saldo - 1000 >= 10000) {
									saldo -= 10000;
									JOptionPane.showMessageDialog(null, "El saldo actual es: " + saldo);
								}
								break;

							case "c":
								if ((saldo - 20000) >= 10000) {
									saldo -= 20000;
									JOptionPane.showMessageDialog(null, "El saldo actual es: " + saldo);
								}
								break;

							case "d":
								if ((saldo - 50000) >= 10000) {
									saldo -= 50000;
									JOptionPane.showMessageDialog(null, "El saldo actual es: " + saldo);
								}
								break;

							case "e":
								if ((saldo - 100000 >= 10000)) {
									saldo -= 100000;
									JOptionPane.showMessageDialog(null, "El saldo actual es: " + saldo);
								}
								break;

							case "f":
								cadena = JOptionPane.showInputDialog(null, "Digite la cantidad de dinero a retirar");
								if ((cadena != null && !cadena.equals("") && ValidacionNumero.isNum(cadena))
										&& (saldo - Integer.parseInt(cadena) >= 10000)
										&& (Integer.parseInt(cadena) > 0)) {
									saldo -= Integer.parseInt(cadena);
									JOptionPane.showMessageDialog(null, "Su saldo actual es: " + saldo);
								}
								break;

							default:
								JOptionPane.showMessageDialog(null, "La opcion no existe, vuelva a digitar");
								break;
							}
						}
					}
				} else {
					JOptionPane.showMessageDialog(null, "La contrase�a es incorrecta");
				}
			}
		}

	}

	// Metodo para cambiar clave
	public void cambiarClave() {
		String auxiliar;
		String contrase�aNueva;

		auxiliar = JOptionPane.showInputDialog(null, "Digite su clave actual ");
		if (auxiliar != null) {
			if (!auxiliar.equals("")) {
				if (auxiliar.equals(contrase�a)) {
					contrase�aNueva = JOptionPane.showInputDialog("Digite su nueva clave");
					if (contrase�aNueva != null) {
						if (!contrase�aNueva.equals("")) {
							if (contrase�aNueva.length() > 3) {
								auxiliar = null;
								auxiliar = contrase�a;
								JOptionPane.showMessageDialog(null, "Su clave anterior es " + auxiliar);
								JOptionPane.showMessageDialog(null, "Su nueva contrase�a es: " + contrase�aNueva);
								contrase�a = contrase�aNueva; 
							} else {
								JOptionPane.showMessageDialog(null,
										"Por favor digite una clave que tenga mas de 3 letras");
							}
						}
					}
				} else {
					JOptionPane.showMessageDialog(null, "La clave no coincide");
				}

			}
		}
	}

	// Metodo para consultar
	public void consultarsaldo() {
		JOptionPane.showMessageDialog(null, "Su saldo actual es: " + saldo);
	}
}
