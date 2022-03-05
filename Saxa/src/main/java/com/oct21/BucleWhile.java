package com.oct21;

import java.util.Scanner;

public class BucleWhile {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1, num2; 
		System.out.print("Ingrese el valor final: "); 
		num1= teclado.nextInt(); 
		num2 = 1; 
		while (num2<=num1) {
			System.out.print(num2); 
			System.out.print(" - ");
			num2 = num2 + 1; 
		} 
		teclado.close(); 
	}

}
