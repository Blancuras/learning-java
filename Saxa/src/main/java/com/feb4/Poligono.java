package com.feb4;

public abstract class Poligono {
	protected int numLados;

	public Poligono(int numLados) {
		this.numLados = numLados;
	}

	public int getNumLados() {
		return numLados;
	}

	public void setNumLados(int numLados) {
		this.numLados = numLados;
	}

	@Override
	public String toString() {
		return "Numero Lados= " + numLados;
	}  
	
	
	//Declaramos el metodo  area como abstracto, las clases hijas tendran que 
	//implementar el metodo
	public abstract double area(); 
	
	
	
}
