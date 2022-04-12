package com.marzo;

public class PruebaAritmetica {
	
	public static void main(String[] args) {
		
		//variable LOCAL
		int operandoA = 6; 
		int operandoB = 2; 
		
		//Creamos un objeto de la clase Aritmetica enviando argumentos
		Aritmetica objeto1 = new Aritmetica(operandoA, operandoB);
		
		//Imprimimos los valores de los operados
		System.out.println("OperandoA = " + operandoA);
		System.out.println("OperandoB = " + operandoB); 
		
		//Imprimimos el resultado de la suma 
		System.out.println("\nResultado suma: " + objeto1.sumar()); 
		System.out.println("\nResultado resta: " + objeto1.restar()); 
		System.out.println("\nResultado de la multiplicacion es: " + objeto1.multiplicar()); 
		System.out.println("\nEl resultado de la division es: " + objeto1.dividir());
	}
	
}
