package com.feb17;

public class SobrecargaPrincipal {

	public static void main(String[] args) {

		Sobrecarga metodos = new Sobrecarga(100, "Christian");
		int edad = metodos.calcularCuantosAniosTienes(2021, 2006);
		System.out.println(edad);

		int numero = metodos.multiplicar();
		System.out.println(numero);
	}

}
