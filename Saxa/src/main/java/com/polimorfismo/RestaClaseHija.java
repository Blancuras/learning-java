package com.polimorfismo;


public class RestaClaseHija extends OperacionesClasePadre{
	
	@Override 
	public void operaciones() {
		resultado = valor1 - valor2;
	}

}
