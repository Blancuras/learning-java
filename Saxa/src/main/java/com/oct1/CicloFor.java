package com.oct1;

import java.util.Scanner;

public class CicloFor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int limite = 10;
		int contador = 0;
		for ( ; contador < limite; ) {
			System.out.println("numero = " + contador);
			contador++;
		}
			
	}

}
