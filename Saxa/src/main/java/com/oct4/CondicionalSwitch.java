package com.oct4;

import javax.swing.JOptionPane;

public class CondicionalSwitch {

	public static void main(String[] args) {
		int dato, figura;
		double base, altura, lado, radio, area, perimetro=0;

		dato = Integer.parseInt(
				JOptionPane.showInputDialog("Que deseas calcular?\n" + "1.-Area\n 2.-Perimetro\n(Escribe el numero)"));

		if (dato == 1) {
			figura = Integer.parseInt(
					JOptionPane.showInputDialog("De que figura" + "deseas calcular el area\n1.-Triangulo\n2.-Cuadrado\n"
							+ "3.-Rectangulo\n 4.-Circulo\n (Escribe solo el numero)"));

			switch (figura) {
			case 1:
				base = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de la base"));
				altura = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de la altura"));

				area = (base * altura) / 2;
				JOptionPane.showMessageDialog(null, "El area del triangulo es: " + area);
				break;
			case 2:
				lado = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor del lado"));

				area = lado * lado;
				JOptionPane.showMessageDialog(null, "El area del cuadrado es: " + area);
				break;
			case 3:
				base = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de la base"));
				altura = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de la altura"));

				area = base + altura;
				JOptionPane.showMessageDialog(null, "El area del rectangulo es: " + area);
				break;
			case 4:
				radio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor del radio"));
				area = 3.1416 * Math.pow(radio, 2);

				JOptionPane.showMessageDialog(null, "El area del circulo es: " + area);
				break;
			default:
				JOptionPane.showMessageDialog(null, "La opcion qu elegiste no es valida");
			}
		} else if (dato == 2) {
			figura = Integer.parseInt(
					JOptionPane.showInputDialog("De que figura" + "deseas calcular el area\n1.-Triangulo\n2.-Cuadrado\n"
							+ "3.-Rectangulo\n 4.-Circulo\n (Escribe solo el numero)"));

			switch (figura) {
			case 1:
				lado = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor del lado del triangulo equilatero "));
				
				area = (lado * 3);
				JOptionPane.showMessageDialog(null, "El perimetro del triangulo es: " + perimetro);
				break;
			case 2:
				lado = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor del lado"));

				perimetro = lado * 4;
				JOptionPane.showMessageDialog(null, "El area del cuadrado es: " + perimetro);
				break;
			case 3:
				base = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de la base"));
				altura = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de la altura"));

				perimetro = base*2 + altura*2;
				JOptionPane.showMessageDialog(null, "El area del rectangulo es: " + perimetro);
				break;
			case 4:
				radio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor del radio"));
				perimetro = 3.1416 * radio * 2;

				JOptionPane.showMessageDialog(null, "El perimetro del circulo es: " + perimetro);
				break;
			default:
				JOptionPane.showMessageDialog(null, "La opcion qu elegiste no es valida");
			}
		} else {
			JOptionPane.showMessageDialog(null, "La opcion no es valida");
		}

	}

}
