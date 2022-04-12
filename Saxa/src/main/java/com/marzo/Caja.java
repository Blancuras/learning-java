package com.marzo;

public class Caja {

	private int ancho; 
	private int alto; 
	private int profundo;
	
	public Caja() {
		
	}

	public Caja(int ancho, int alto, int profundo) {
		this.ancho = ancho;
		this.alto = alto;
		this.profundo = profundo;
	} 
	
	private void calcularVolumen() {

	}

	@Override
	public String toString() {
		return "Caja [ancho=" + ancho + ", alto=" + alto + ", profundo=" + profundo + "]";
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getProfundo() {
		return profundo;
	}

	public void setProfundo(int profundo) {
		this.profundo = profundo;
	}
	
	
}
