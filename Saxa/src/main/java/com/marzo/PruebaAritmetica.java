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
	}
	

	
	
		/*//Creamos un objeto de tipo aritmetica
		Aritmetica aritmetica = new Aritmetica(); 
		aritmetica.a = 10; 
		aritmetica.b = 3; 
		int resultado = aritmetica.sumar(); 
		
		System.out.println("resultado = " + resultado);
		
		//Creacion de un segundo objeto Aritmetica
		Aritmetica aritmetica2 = new Aritmetica(4,2);
		System.out.println("resultado2 = " + aritmetica2.sumar());*/
	
}
