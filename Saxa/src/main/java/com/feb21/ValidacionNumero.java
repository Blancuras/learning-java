package com.feb21;

public class ValidacionNumero {

	public static boolean isNum(String cadena) {
		try {
			Integer.parseInt(cadena.trim());
			return true;
		} catch (Exception error) {
			System.out.println("Error error "+ error);
			return false;
		} 
	}
	
	public static void main(String[] args) {
		System.out.println("is number "+isNum(" 1 ")); ;
		System.out.println("is number "+isNum(null)); ;
	}
}