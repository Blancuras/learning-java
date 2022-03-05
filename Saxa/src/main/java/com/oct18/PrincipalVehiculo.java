package com.oct18;

import java.util.Scanner;

public class PrincipalVehiculo { 
	
	public static int indiceCocheMasBarato(Vehiculo coches[]) {
		int auxiliar = 0;  
		float precio = coches[0].getPrecio();
		
		for(int indice1 = 1; indice1 <coches.length; indice1++) {
			float precioCocheActual = coches[indice1].getPrecio();
			
			if( precioCocheActual < precio) {
				precio = precioCocheActual; 
				auxiliar = indice1 ; 
			}
		}
		return auxiliar;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		String marca, modelo; 
		float precio; 
		int numeroVehiculos, indiceBarato; 
		
		System.out.println("Digite la cantidad de Vehiculos"); 
		numeroVehiculos = entrada.nextInt(); 
		
		//Creamos los objetos para los coches
		Vehiculo coches[] = new Vehiculo[numeroVehiculos]; 
		
		for(int indice=0; indice<coches.length; indice++) {
			entrada.nextLine(); 
			System.out.println("\nDigite las caracteristicas del coche "+(indice+1)+":");
			System.out.println("Introduzca Marca: "); 
			marca = entrada.nextLine(); 
			System.out.println("Introduzca Modelo: ");
			modelo = entrada.nextLine(); 
			System.out.println("Introduzca precio");
			precio = entrada.nextFloat(); 
			
			coches[indice] =  new Vehiculo(marca, modelo, precio); 
		} 
		entrada.close();
		indiceBarato = indiceCocheMasBarato(coches); 
		System.out.println("\nEl coche mas barato es: "); 
		System.out.println(coches[indiceBarato].mostrarDatos());
		
		
	}

}
