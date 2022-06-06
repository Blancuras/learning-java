package com.polimorfismo;

public class SumaClaseHija extends OperacionesClasePadre{
	
	@Override 
	public void operaciones() {
		resultado = valor1 + valor2;
	}
	
}
