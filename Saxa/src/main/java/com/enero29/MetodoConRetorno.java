package com.enero29;

public class MetodoConRetorno {

	public int suma(int num1, int num2) {
		int resultado = 0;
		if (num1 > 0 && num2 > 0) {
			resultado = num1 + num2;
		}
		return resultado;
	}

	public int resta(int num1, int num2) {
		int resultado = 0;
		if (num1 > 0 && num2 > 0) {
			resultado = num1 - num2;
		}
		return resultado;
	} 
	public int multiplicacion(int num1, int num2) {
		int resultado = 0; 
		if(num1 > 0 && num2>0) {
			resultado = num1 * num2; 
		}
		return resultado; 
	} 
	public int division(int num1, int num2) {
		int resultado = 0; 
		if(num1 > 0 && num2>0) {
			resultado = num1 / num2; 
		}
		return resultado; 
	}

}
