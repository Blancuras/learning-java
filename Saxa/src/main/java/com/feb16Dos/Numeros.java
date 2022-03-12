package com.feb16Dos;

public class Numeros {

	// Creamos un metodo para calcular el mayor de 3 numeros
	public int calcularMayorNumero(int primerValor, int segundoValor, int tercerValor) {

		int mayor;
		if (primerValor > segundoValor && primerValor > tercerValor) {
			mayor = primerValor;
		} else if (segundoValor > tercerValor) {
			mayor = segundoValor;
		} else {
			mayor = tercerValor;
		}
		return mayor;
	}

	// Creamos un metodo para calcular el menor de 3 numeros
	public int calcularMenorNumero(int primerValor, int segundoValor, int tercerValor) {
		int menor;
		if (primerValor < segundoValor && primerValor < tercerValor) {
			menor = primerValor;
		} else if (segundoValor < tercerValor) {
			menor = segundoValor;
		} else {
			menor = tercerValor;
		}

		return menor;
	}
}
