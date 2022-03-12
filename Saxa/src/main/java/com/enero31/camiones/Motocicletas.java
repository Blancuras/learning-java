package com.enero31.camiones;

public class Motocicletas extends Gasolina{
	
	@Override
	public void llantas() {
		System.out.println("Yo soy una moto y me desplazo con dos llantitas");
		camion();
	}

	@Override
	public void cargarGasolina() {
		System.out.println("Moto cargando gaolina");
		camion();
	}
	
	
}
