package com.enero24Poo;

public class UsoVehiculo {

	public static void main(String[] args) {

		Carro micoche1 = new Carro();

		micoche1.estableceColor("Rojo");

		Furgoneta miFurgoneta1 = new Furgoneta(7, 580);

		miFurgoneta1.estableceColor("azul");

		miFurgoneta1.isAsientosCuero("Si");
		
		miFurgoneta1.configuraClimatizador("Si"); 
		
		//System.out.println(micoche1.dimeDatosGenerales());
		
		

		
		
		
		
		
		
		
		
		
		
		/*
		 * Carro renault = new Carro(); // Instanciar una clase
		 * System.out.println("Este coche tiene " + renault.getRuedas() + " ruedas");
		 * System.out.println("Este coche mide de largo " + renault.getLargo());
		 * 
		 * renault.estableceColor();
		 */

	}

}
