package enero19;

import java.util.Scanner;

public class AdivinaNumero {

	public static void main(String[] args) {
		int aleatorio = (int) (Math.random() * 100);
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		int intentos = 0;

		do {
			intentos++; // INCREMENTA EN 1 LA VARIABLE INTENTOS
			System.out.println("Introduce un numero");
			numero = entrada.nextInt();
			if (aleatorio < numero) {
				System.out.println("Mas bajo");
			} else if (aleatorio > numero) {
				System.out.println("Mas alto");
			}
		} while (numero != aleatorio);
		System.out.println("Correcto. Lo haz conseguido en " + intentos + " intentos!"); 
		entrada.close();
	}

}
