package com.oct4;

public class ForEach {

	public static void main(String[] args) {
		String frutas[] = new String[10]; 
		frutas[0] = "Manzana";  
		frutas[1] = "Pera";  
		frutas[2] = "Melon";  
		frutas[3] = "Cereza";  
		frutas[4] = "Uva";  
		frutas[5] = "Toronja";  
		frutas[6] = "Mango";  
		frutas[7] = "Durazno";  
		frutas[8] = "Naranja";  
		frutas[9] = "Mandarina";   
		System.out.println("Chorizon "+ frutas);
		
		for(String fruta: frutas) {
			System.out.println(fruta);
		}
	}

}
