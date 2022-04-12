package com.marzo;

public class PasoPorValor {
	public static void main(String[] args) {
		String x = "aa"; 
		System.out.println("x = " + x); 
		cambiarValor(x); 
		
		System.out.println("x = " + x); 
	}
	
	
	
	

	private static void cambiarValor(String arg) {
		arg = "fjhkjfh"; 
//		System.out.println("arg = " + arg); 
	}
}
