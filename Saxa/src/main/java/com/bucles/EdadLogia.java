package com.bucles;

public class EdadLogia {
	
	public static String calcularEdad(int edad) {
		return "Tu edad es: " + edad; 
	}
	
	public static String calcularEdadV2(int edad) {
		if (edad < 18) {
			return "peque";
		}else if (edad < 50) {
			return "adulto";
		}else {
			return "mayor";
		}
	}
	
}
