package com.saxa.practices.calculadora;

public class EjecutarCalculadoraConInstancia {
	public static void main(String[] args) {
		Calculadora cal = new Calculadora(); 
		int resultado = cal.sumar(5, 7); 
		System.out.println("suma " + resultado);
		int resultadoResta = cal.resta(14, 10); 
		System.out.println("resta " + resultadoResta); 
		
		int resultadoMultiplicacion = cal.multiplicacion(4, 1); 
		System.out.println("multipicacion " + resultadoMultiplicacion); 
		
		int resultadoDivision = cal.division(5, 5); 
		System.out.println("division " + resultadoDivision); 
		
		int resultadoModulo = cal.modulo(11, 2); 
		System.out.println("modulo " + resultadoModulo);
	} 
	
}
