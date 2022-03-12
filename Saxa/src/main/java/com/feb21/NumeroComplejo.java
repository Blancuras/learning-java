package com.feb21;

public class NumeroComplejo {

	// Creamos los atributos de un numero complejo
	private double parteReal;
	private double parteImaginaria;

	public NumeroComplejo(double parteReal, double parteImaginaria) {
		this.parteReal = parteReal;
		this.parteImaginaria = parteImaginaria;
	}

	public double getParteReal() {
		return parteReal;
	}

	public void setParteReal(double parteReal) {
		this.parteReal = parteReal;
	}

	public double getParteImaginaria() {
		return parteImaginaria;
	}

	public void setParteImaginaria(double parteImaginaria) {
		this.parteImaginaria = parteImaginaria;
	}

	// Creamos el metodo para calcular la suma de numeros complejos
	public NumeroComplejo calcularSuma(NumeroComplejo numero) {
		NumeroComplejo suma = new NumeroComplejo(parteReal + numero.getParteImaginaria(),
				parteImaginaria + numero.getParteImaginaria());
		return suma;
	}

	// Creamos el metodo para calcular producto
	public NumeroComplejo calcularProducto(NumeroComplejo numero) {
		NumeroComplejo multiplicacion = new NumeroComplejo(
				(parteReal * numero.getParteReal() - parteImaginaria * numero.getParteImaginaria()),
				(parteReal * numero.getParteImaginaria() + numero.getParteReal() * parteImaginaria));
		return multiplicacion;
	}
	//Creamos el metodo para comprobar la igualdad
	public boolean comprobarIgualdad(NumeroComplejo numero) {
		boolean igualdad = false; 
		if(parteReal == numero.getParteReal() && (parteImaginaria == numero.getParteImaginaria())){
			igualdad = true; 
		} 
		return igualdad; 
	} 
	
	//Creamos el metodo para calcular producto de entero por complejo
	public NumeroComplejo multiplicarPorEntero(int numero) {
		NumeroComplejo multiplicacion = new NumeroComplejo(parteReal * numero, parteImaginaria * numero); 
		return multiplicacion; 
	}
}
