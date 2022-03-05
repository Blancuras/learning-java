package com.oct7;

public class OverloadingSobrecarga {

	public static void main(String[] args) {
		
		imprimir("Hola");
	}

	private static void imprimir(String dato) {
		System.out.println("Dato String " + dato);
	}
	private void imprimir(int dato) {
		System.out.println("Dato int " + dato);
	} 
	public static String imprimir(int dato, String aa) {
		System.out.println("Dato doble " + dato +" aa "+aa);
		return "";
	} 
	private void imprimir() {
		System.out.println("No Dato " );
	}
}
