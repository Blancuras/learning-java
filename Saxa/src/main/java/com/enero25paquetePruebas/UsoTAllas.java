package com.enero25paquetePruebas;

import java.util.Scanner;

public class UsoTAllas {
	// enum Talla {MINI, MEDIANO, GRANDE, MUYGRANDE}
	enum Talla {
		MINI("S"), MEDIANO("M"), GRANDE("L"), MUYGRANDE("XL");

		private Talla(String abreviatura) {
			this.abreviatura = abreviatura; // setter
		}

		public String dameAbreviatura() {
			return abreviatura;
		}

		private String abreviatura;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, MUY GRANDE");
		String entradaDatos = entrada.next().toUpperCase();

		Talla laTalla = Enum.valueOf(Talla.class, entradaDatos);
		System.out.println("Talla =" + laTalla);
		System.out.println("Abreviatura = " + laTalla.dameAbreviatura());
	
		
		
		
		
		/*
		 * Talla s = Talla.MINI; Talla m = Talla.MEDIANO; Talla l = Talla.GRANDE; Talla
		 * xl = Talla.MUYGRANDE;
		 */

	}
}
