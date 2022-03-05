package com.saxa.practices;

public class FinalVariablesAndPrimitives {

	public static void main(String[] args) {
		final int myNum = 15;
//		myNum = 20; 
		int x = 5;  
		int y = 6; 
		System.out.println(x + y);
		int a = 3, b = 4;
		System.out.println(a +b);
		float t = 3.3f; 
		long i = 23l;
		double e = 19.98755d;
		char myGrade = 'D'; // PARA GUARDAR UNA SOLA LETRA, ENTRE COMILLAS SIMPLES
		boolean w = true; 
		char arroba = 64; 
		System.out.println(arroba); // alt 64 @ 
		String yy = "@";
		System.out.println(yy.hashCode());
		String tt = null; 
		System.out.println(tt);
	}
	
	
}
