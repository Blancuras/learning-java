package com.sept24;

public class Operaciones {

	public static void main(String[] args) {
		int operacion = 3;
		int num1 = 8;
		int num2 = 4;
		int resultado = 0;

		if(operacion == 1) {
			resultado = num1 + num2; 
			System.out.println("El resultado de la suma es:  " + resultado);
		} else if(operacion == 2) {
			resultado = num1 - num2; 
			System.out.println("El resultado de la resta es: " + resultado);
		} else if(operacion == 3) {
			resultado = num1 * num2;  
			System.out.println("El resultado de la multiplicacion es: " + resultado); 
		} else if(operacion ==4) {
			resultado = num1 / num2; 
			System.out.println("El resultado de la division es: " + resultado);
		} else {
			System.out.println("La opcion que elegiste no existe."); 
		}
	}
}
