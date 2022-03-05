package com.bucles;

public class BucleDoWhile {

	public static void main(String[] args) {
		int i = 1;  
		do {
			System.out.println("este mensaje se mustra al menos una vez"); 
	
			i-=10;// i = i -10;
		} while(i > 0); 
		System.out.println("fin del programa");
	}
 }