package enero27;

import java.util.Scanner;

public class VectorDos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int[] numero = new int[6];
		System.out.println("Ingresa 6 numeros:");
		for (int contador = 0; contador < numero.length ; contador++) {
			numero[contador] = entrada.nextInt();
		}
		for (int contador = 0; contador < numero.length; contador++) {
			if (numero[contador] % 2 == 0) {
				System.out.println(numero [contador] + " = par ");
			} else {
				System.out.println(numero [contador] + " = impar "); 
				entrada.close();
			}
		}
	}
}
