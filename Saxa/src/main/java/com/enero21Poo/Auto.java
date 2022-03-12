package com.enero21Poo;

public class Auto {
	private String patente; 
	private String color; 
	private int km; 
	private boolean conAire; //false
	
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	public boolean isConAire() {
		return conAire;
	}
	public void setConAire(boolean conAire) {
		this.conAire = conAire;
	}
	@Override
	public String toString() {
		return "Auto [patente=" + patente + ", color=" + color + ", km=" + km + ", conAire=" + conAire + "]";
	} 
	
	
	  
	
	
}
