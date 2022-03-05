package com.oct11;

import java.util.Scanner;

/*
 * for(inicializacion; condicion; aumento o decremento){
 * 		Instrucciones;
 * }
 */
public class CicloFor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		int contador; 
		
		System.out.println("Digita la cantidad de terminos: "); 
		contador = entrada.nextInt(); 
		entrada.close();
		
		for (int indice = 2; 
				indice <= contador; 
				indice+=2) {
			System.out.println(indice);
		}
	}

}
