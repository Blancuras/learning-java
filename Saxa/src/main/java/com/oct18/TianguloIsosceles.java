/*
 * Diseñar un programa para trabajar con triangulos isosceles. Para ello define los atributos 
 * necesarios que se requieren, proporcione metodos de consulta, un metodo constructor e implementa
 * metodos para calcular el perimetro yel area de un triangulo, ademas implementar un metodo que 
 * a partir de un arreglo de trinagulos devuelva el area del triangulo de mayor superficie. 
 * metodos pra
 */
package com.oct18;

public class TianguloIsosceles {
	private double base;
	private double lado;

	public TianguloIsosceles(double base, double lado) {
		this.base = base;
		this.lado = lado;
	}

	public double obtenerPerimetro() {
		return 2 * lado + base;
	}

	public double obtenerArea() {
		return (base * Math.sqrt((lado * lado) - ((base * base) / 4))) / 2;
	}

	public String mostrarDatos() {
		return ("Base: " + base + "\nLado: " + lado + "\nPerimetro " + obtenerPerimetro() + "\nArea: " + obtenerArea()
				+ "\n");
	}

}
