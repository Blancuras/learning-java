package com.enero26;

public class CiclosDos {

	public static void main(String[] args) {
		int indice = 1, num2 = 99;

		for (indice = 1; indice <= 5; indice++) {
			if (indice < 5) {
				System.out.print(indice + ",");
				System.out.print(num2 + ",");
			} else {
				System.out.print(indice + ","); 
				System.out.print(num2);
			} 
			num2--; 
		}

	}

}
