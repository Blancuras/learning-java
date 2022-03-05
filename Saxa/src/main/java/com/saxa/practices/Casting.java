package com.saxa.practices;

public class Casting {

	public static void main(String[] args) {
		//cast automatico es decir quelo hace transparente, como que aqui no paso nada
		byte g = 1; //max 128 
		short r = g; // max 32000
		int s = 12; 
		double z = s; 
		
		
		//cast manual 
		short q = 31001; 
		byte a = (byte) q; // Se especifica entre parentesis al tipo de objeto al que se va a convertir
		System.out.println("corrio el programa con exito");
		System.out.println(a);
		
		double f = 3.4; 
		int j = (int) f; 
		System.out.println(j);
		
	}
	
	
}
