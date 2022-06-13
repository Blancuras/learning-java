package com.curso3;

public class UsoArrays {

	public static void main(String[] args) {
		/*int [] miArreglo=new int[5]; 
		miArreglo[0]=5;  
		miArreglo[1]=38; 
		miArreglo[2]=-15; 
		miArreglo[3]=92; 
		miArreglo[4]=71;  */ 
		
		int[] miArreglo= {5,38,-15,92,71,34,65,87,89,32,23,78}; //inicializacion de arreglo
		
		for (int indice = 0; indice < miArreglo.length; indice++) {
			int valor = miArreglo[indice];
			System.out.println("valor "+ valor);
			System.out.println("valor "+ miArreglo[indice]);
		}
		
//		for (int i=0;i<miArreglo.length;i++) {
//			System.out.println("Valor del indice " + i + " = " + miArreglo[i]);
//		}
	}

}
