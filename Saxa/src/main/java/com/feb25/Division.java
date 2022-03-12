package com.feb25;

public class Division extends RuntimeException {
	
	public static int dividir(int numerador, int denominador) throws OperacionAritmetica{
	//throws indica a un metodo que hay una excepcion de tipo operacionAritmetica
		if(denominador==0) {
			throw new OperacionAritmetica("Error al dividir entre 0");  //Sirve para lanzar una excepcion
		} 
		return numerador/denominador; 
	} 
	
}
