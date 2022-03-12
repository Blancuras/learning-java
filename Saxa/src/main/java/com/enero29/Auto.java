package com.enero29;

public class Auto {
	
	private String marca;
	private String modelo;
	private String color;
	private boolean acceso = false; 
	
	
	public void meterLlave(String clave) {
		if(clave.equals("123456")) {
			acceso = true; 
		} else {
			 acceso = false; 
			 System.out.println("Llamar a la policia");
		}
	} 
	public void mando(String accion) {
		if(acceso == true) {
			if(accion.equals("enciende")) {
				enciende();
			}
		}
	}

	private void enciende() {
		System.out.println("Enciende run run");
	}

	public void acelera() {
		System.out.println("Velocimetro 80km");
	}

	public void frenar() {
		System.out.println("Velocimetro 0km");
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isAcceso() {
		return acceso;
	}
	public void setAcceso(boolean acceso) {
		this.acceso = acceso;
	}
	
	@Override
	public String toString() {
		return "Auto [" + (marca != null ? "marca=" + marca + ", " : "")
				+ (modelo != null ? "modelo=" + modelo + ", " : "") + (color != null ? "color=" + color + ", " : "")
				+ "acceso=" + acceso + "]";
	}
	
	
}
