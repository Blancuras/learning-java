package com.curso3;

import java.util.*;

public class AdivinaNumero {

	public static void main(String[] args) {

		int aleatorio = (int) (Math.random() * 100);  //0.5 50 

		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		int intentos = 0;
		
		 while (numero != aleatorio){   //!= diferente 
			intentos++; 
			System.out.println("Introduce un numero");
			numero = entrada.nextInt();

			if (aleatorio < numero) {
				System.out.println("Pongale numero mas bajo");
			} else if (aleatorio > numero) {
				System.out.println("Pongale numero mas alto");
			}

		}
		 entrada.close();
		System.out.println("Correcto. Lo has conseguido en " + intentos + " intentos");

	}

}
