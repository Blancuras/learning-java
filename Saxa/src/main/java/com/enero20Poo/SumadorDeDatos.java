package com.enero20Poo;

public class SumadorDeDatos {

	public static double calcular(DatosMagicos datosMagicos , Cripto cripto) {
		return datosMagicos.getCateto() + datosMagicos.getHipotenusa() 
		+ datosMagicos.getObtuso() + datosMagicos.getPitagoras() + cripto.getVolumen();
	}
}
