package com.enero20Poo;

public class MultiplicadorDeDatos {
	
	public static double calcular(DatosMagicos datosMagicos , Cripto cripto) {
		return datosMagicos.getCateto() * datosMagicos.getHipotenusa() 
		* datosMagicos.getObtuso() * datosMagicos.getPitagoras()+ cripto.getPrecio();
	}
	
}
