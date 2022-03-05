package com.oct12;

public class Arreglos3 {

	public static void main(String[] args) {
		String[] nombres = {"Alejandro", "Maria","Luisa", "Juan", "Narcisa", "Luis", "Roberto","Flor","Jessica"}; 
		
		for(int indice = 0; indice<nombres.length; indice++) { //.length para saber cuantos elementos hay en el arreglo
			System.out.println(indice+" "+nombres[indice]); 
		}
		int indice = 0;
		for(String nombre: nombres) { 
			indice++;
			System.out.println(indice +" "+nombre);
		}
	}

}
