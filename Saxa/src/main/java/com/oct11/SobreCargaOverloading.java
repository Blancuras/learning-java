package com.oct11;

import com.sept24.Suma;

public class SobreCargaOverloading {

	public static void main(String[] args) {
		suma(5, 6); 
		suma(2.5, 8.2); 
	} 
	private static void suma(int num1, int num2) {
		System.out.println(num1 + num2);
	} 
	private static void suma(double num1, double num2) {
		System.out.println(num1 + num2); 
	}

}
