package com.saxa.practices;

public class Operators {

	public static void main(String[] args) {
		modulus(); 
		division(); 
		increment(); 
		decrement(); 
		masIgual();
	}
	
	private static void modulus() {
		System.out.println(10%3);
		System.out.println(11%2);
	}
	
	private static void increment() {
		int uno = 0; 
		uno++; 
		System.out.println("increment "+ uno);
		uno++; 
		System.out.println("increment " + uno); 
		uno++; 
		System.out.println("increment " + uno);
	} 
	
	private static void decrement() {
		int diez = 10;  
		diez--; 
		System.out.println("decrement " + diez); 
		diez--; 
		System.out.println("decrement " +diez);  
		diez--; 
		System.out.println("decrement " +diez); 
	}
	
	private static void division() {
		System.out.println("division " +(10/3)); 
	} 
	
	private static void masIgual() {
		int diez = 10; 
//		diez = diez + 5;
		diez += 5; //15
		System.out.println("1mas Igual metodo  " + diez); //15
		diez +=5;
		System.out.println("2mas Igual " +( diez ));//20
		System.out.println("3mas Igual " + diez);//20
	}
}
