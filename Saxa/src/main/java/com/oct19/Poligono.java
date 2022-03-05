package com.oct19;
	public abstract class Poligono{
		protected int numeroLados; 

	public Poligono(int numeroLados) {
		this.numeroLados = numeroLados;
	}

	protected int getNumeroLados() {
		return numeroLados;
	}

	@Override
	public String toString() {
		return "Numero Lados=" + numeroLados;
	}

	// Declaramos el metodo area como abstracto
	public abstract double area(); 

}
