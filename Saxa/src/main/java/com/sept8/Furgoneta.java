package com.sept8;

public class Furgoneta extends Coche{ 
	private int capacidadExtra; 
	private int plazasExtra;
	private int capacidadCarga; 
	
	public Furgoneta(int plazasExtra, int capacidadCarga) {
		super(); //llama al constructor de la clase padre 
		this.capacidadCarga=capacidadCarga; 
		this.plazasExtra=plazasExtra; 
	} 
	
	public String dimeDatosFurgoneta() {
		return " la capacidad de carga es: " + capacidadCarga + " Y las plazas son " + plazasExtra; 
	}

}
