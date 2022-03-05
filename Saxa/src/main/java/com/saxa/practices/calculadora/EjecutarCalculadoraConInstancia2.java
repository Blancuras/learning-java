package com.saxa.practices.calculadora;

public class EjecutarCalculadoraConInstancia2 {
	public static void main(String[] args) {
		 llamarCalculadoraSuma();  
		 llamarCalculadoraResta();  
		 llamarMetodoMultiplicacion(); 
		 division(); 
		 modulo(); 
	} 
	
	private static void llamarCalculadoraSuma() {
		Calculadora calculadora1 = new Calculadora();//Esto es crear una instancia de Calculadora
		int sum = calculadora1.sumar(3,3);  
		System.out.println("resultado de la suma " + sum );
	} 
	
	private static void llamarCalculadoraResta() {
		Calculadora calcu = new Calculadora(); 
		int resta = calcu.resta(10, 5); 
		System.out.println("El resultado de la resta es " + resta);	
	} 
	
	private static void llamarMetodoMultiplicacion() {
		Calculadora multi = new Calculadora();
		int resultado = multi.multiplicacion(3, 10); 
		System.out.println("resultado de la multiplicacion es " + resultado);
	} 
	
	private static void division() {
		Calculadora calculadora = new Calculadora(); 
		int resultado = calculadora.division(9, 2); 
		System.out.println("resultado de la division es " + resultado);
	} 
	
	private static void modulo() {
		Calculadora calculadora = new Calculadora(); 
		int resultado = calculadora.modulo(11, 2); 
		System.out.println("resultado del modulo es " + resultado);
	}
	
	
}
