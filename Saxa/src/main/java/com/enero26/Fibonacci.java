package com.enero26;

public class Fibonacci {
	public static void main(String[] args) {
		int indice = 0;
		int num1 = 0;
		int num2 = 1;
		int num3 = 0;
		for (indice = 0; indice < 10; indice++) {
			if (indice < 9) {
				System.out.print(num1 + ","); 
				num3 = num1 + num2;
				num1 = num2;
				num2 = num3;
			} else {
				System.out.println(num1);
			}
		}

		
		
	
	}
}
