package com.oct14;
//POJO Plain java Object
//BEAN
//Entity
//DTO

public class Coche {
	// Atributos
	private String color;
	private String marca;
	private int km;
	private int num; 
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		if (km >0) {
			this.km = km;			
		}
	}

	// Metodo
	

}
