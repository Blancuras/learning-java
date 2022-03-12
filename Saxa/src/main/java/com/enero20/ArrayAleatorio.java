package com.enero20;

public class ArrayAleatorio {

	public static void main(String[] args) {
		//Instanciando arreglo creando el objeto
		Long[] arregloAleatorio = new Long[150];
		//0.1  10  0.2 =20  1 =100 0=0 
		//Inicializando (Poner valores por primera vez)
		for (int indice = 0; indice < arregloAleatorio.length; indice++) {
			arregloAleatorio[indice] =  Math.round(Math.random() * 100);
//			arregloAleatorio[indice] = indice;
		}
		//imprimiendo 
		for (Long numeros : arregloAleatorio) {
			System.out.println(numeros + " ");
		}
	}
}
