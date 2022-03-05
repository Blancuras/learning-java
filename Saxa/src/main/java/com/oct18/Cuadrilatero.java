/*
 * Construir un progrma que calcule el area y el perimetro de un cuadrilatero dada la longitud de 
 * sus dos lados. los valores de la longitud deberan intoducirse por linea de ordenes.Si 
 * es cuadrado, solo se proporcionara la longitud de uno de los lados del construsctor. 
 */
package com.oct18;

public class Cuadrilatero {
	// Atributos
	private float lado1;
	private float lado2;

	//  Constructor 1 (Cuadrilatero)
	public Cuadrilatero(float lado1, float lado2) {
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	//  Costructor 2 (Cuadrado)
	public Cuadrilatero(float lado1) {
		this.lado1 = lado1; 
		this.lado2 = lado1; 
	}

	public float getPerimetro() {
		return 2 * (lado1 + lado2);
	}

	public float getArea() {
		return (lado1 * lado2);
	}
}
