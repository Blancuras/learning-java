package com.feb2;

public class Operacion {
	// Atributos
	int suma;
	int resta;
	int multiplicacion;
	int division;

	public Operacion() {
		System.out.println("Aqui esta el codigo del constructor");
	}
	
	// Metodos
	// Metodo para sumar ambos numeros
	public void sumar(int numero1, int numero2) { // Parametros son para la declaracion de los metodos
		suma = numero1 + numero2;
	}

	public void restar(int numero1, int numero2) {
		resta = numero1 - numero2;
	}

	public void multiplicar(int numero1, int numero2) {
		multiplicacion = numero1 * numero2;
	}

	public void dividir(int numero1, int numero2) {
		division = numero1 / numero2;
	}

	public void mostrarResultados() {
		System.out.println("La suma es: " + suma);
		System.out.println("La resta es: " + resta);
		System.out.println("La multiplicacion es: " + multiplicacion);
		System.out.println("La division es: " + division);

	}

	@Override
	public String toString() {
		return "Operacion [suma=" + suma + ", resta=" + resta + ", multiplicacion=" + multiplicacion + ", division="
				+ division + "]";
	}
	
	
}
