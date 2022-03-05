package com.sept29;

import java.util.Scanner;

public class Operadores {

	//Realiza un programa que pida dos numeros y que luego muestre el resultado de su multiplicacion
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num1;
		int num2; 
		int resultado; 
		System.out.println("Introduce el primer numero:"); 
		num1 = entrada.nextInt(); 
		System.out.println("Intrtoduce el segundo numero: "); 
		num2 = entrada.nextInt();
		
		resultado = num1 * num2; 
		System.out.println("El resultado de la multiplicacio es " + resultado);
	}

}
