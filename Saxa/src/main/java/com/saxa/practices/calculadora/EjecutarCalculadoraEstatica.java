package com.saxa.practices.calculadora;

public class EjecutarCalculadoraEstatica {


	public static void main(String[] args) {
		llamarSuma(); 
		llamarResta();  
		llamarMultiplicacion(); 
		 llamarDivision();  
		 llamarResiduo(); 
	}
	
	private static void llamarSuma() {
		System.err.println("Maximo int " + Integer.MAX_VALUE);
		System.err.println("Maximo long " + Long.MAX_VALUE);
		int resultado =CalculadoraEstatica.suma(3, 7);
		System.out.println("Resultado de la suma es " + resultado);
	} 
	
	public static void llamarResta() { 
		long resultado = CalculadoraEstatica.resta(12l, 7l); 
		System.out.println("Resultado de la resta es " + resultado);
	} 
	
	private static void llamarMultiplicacion() {
		long resultado = CalculadoraEstatica.multiplicacion(6l, 6l); 
		System.out.println("Resultado de la multiplicacion es " + resultado);
	} 
		
	private static void llamarDivision() {
		long resultado =  CalculadoraEstatica.division(5l, 5l); 
		System.out.println("Resultado de la division es " + resultado);
	}  
	
	private static void llamarResiduo() {
		int resultado = CalculadoraEstatica.residuo(11, 2); 
		System.out.println("Resultado del residuo es " + resultado);
	}
	
}
