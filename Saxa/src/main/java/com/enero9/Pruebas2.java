package com.enero9;

public class Pruebas2 {

	public static void main(String[] args) {
//		operadorAnd1(); 
		operadorAnd2(); 
	}

	private static void operadorAnd1() {
		String nombre = null; 
		boolean resultado =  nombre != null  &&  nombre.isBlank(); //2 pasos
		System.out.println("operadorAnd1 " + resultado);
	} 
	
	private static void operadorAnd2() {
		String role = null; 
		role = role.trim(); 
		boolean isAdmin = role != null && role.equalsIgnoreCase("ADMin"); 
		System.out.println(role + " operadorAnd2 " + isAdmin); 
		
	}
	
	
}
