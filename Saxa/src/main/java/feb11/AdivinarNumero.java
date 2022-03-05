package feb11;

import javax.swing.JOptionPane;

public class AdivinarNumero {

	public static void main(String[] args) {
		int contador = 0;
		int aleatorio = (int) (Math.random() * 50);
		int numero;

		do {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
			if (numero < aleatorio) {
				System.out.println("Digite un numero mayor");
			} else {
				System.out.println("Digite un numero menor");
			}
			contador++;
		} while (numero != aleatorio);
		System.out.println("La cantidad de intentos fueron: " + contador);

	}

}
