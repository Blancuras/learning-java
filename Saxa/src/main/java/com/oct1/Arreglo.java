package com.oct1;

import java.util.Scanner;

public class Arreglo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);  
		Integer [] numero = new Integer [9]; 
		numero[0] = 1; 
		numero[1] = 22; 
		numero[2] = 3; 
		numero[3] = 4; 
		numero[4] = 55; 
		
		for(int contador = 0; contador <numero.length; contador++) {
			System.out.println(numero[contador]);
		}
	}

}
