package com.enero17;

public class Casting { // Convertir un tipo de dato a otro

	public static void main(String[] args) {
		// cast implicito
		// Declaro e inicializo una variable de tip int y una de tipo float
		int varInt = 50;
		float varFloat = 100.5454f;
		
		int dkjd = (int) varFloat;
		
		//De tipo int a long 
		long varLong = varInt; 
		
		//De tipo float a double 
		double varDouble = varInt; 
		
		//Casting Explicito 
		varLong = 50; 
		
		//De long a byte 
		byte varByte = (byte) varLong; 
		
	}

}
