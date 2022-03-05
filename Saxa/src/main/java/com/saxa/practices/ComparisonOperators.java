package com.saxa.practices;

public class ComparisonOperators {
	private static int x = 10; 
	private  static int y = 10;
	private static int z = 11; 
	
	public static void main(String[] args) {
		 equalsOperator();  
		 sonDiferentes1();  
		 sonDiferentes(); 
		 mayorQue();  
		 menorQue(); 
	}
	private static void equalsOperator() {
		
		boolean iguales = x == y; 
		System.out.println("son iguales " + iguales);
	}
	
	private static void sonDiferentes1() {
		boolean noSonIguales = x != y;
		System.out.println("son diferentes1 " +  noSonIguales);
		System.out.println("son diferentes1 " +  (x != y) );
	} 
	private static void sonDiferentes() {
		boolean noSonIguales = x != z;  
		System.out.println("son diferentes2 " + noSonIguales); 
		System.out.println("son diferentes2 " + (x != z)); 
	}
	
	private static void mayorQue() {
		boolean mayorQue = z >x; 
		System.out.println("mayor que " + mayorQue); 
		System.out.println("mayor que " + (z > x)); 

	}
	private static void menorQue() {
		boolean menorQue = x < z; 
		System.out.println("menor que " + menorQue); 
		System.out.println("menor que " + (x < z)); 
	}
	
	
	
}
