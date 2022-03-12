package com.feb4;

public class VehiculoFurgoneta extends VehiculoModerno {
	private int carga;

	public VehiculoFurgoneta(int carga, String matricula, String marca, String modelo) {
		super(matricula, marca, modelo);
		this.carga = carga;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public String mostrarDatos() {
		return "Matricula: " + matricula + "\nMarca: " + marca + "\nModelo " + modelo + "\ncarga: " + carga;
	}

}
