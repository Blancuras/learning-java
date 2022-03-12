package com.feb10;

import java.util.Scanner;

public class LongitudCadenas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String cadena1, cadena2;

		System.out.println("Digite la primera cadena : ");
		cadena1 = entrada.next();

		System.out.println("Digite la segunda cadena :");
		cadena2 = entrada.next();

		int longitudCadena1 = cadena1.length();
		int longitudCadena2 = cadena2.length();

		if (longitudCadena1 > longitudCadena2) {
			System.out.println("La longitud de la primera cadena es mayor");
			System.out.println("La longitud de la segunda cadena es menor");
		} else if (longitudCadena2 > longitudCadena1) {
			System.out.println("La longitud de la segunda cadena es mayor");
			System.out.println("La longitud de la  primera cadena es menor");
		} else {
			System.out.println("Las Longitudes son iguales"); 
		}

	}

}
