package com.oct1;

import java.util.Scanner;
//Invertir el array 
public class Array4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);  
		int[] arreglo = new int[8]; 
		for(int contador=0; contador<8; contador++) {
			arreglo[contador] = entrada.nextInt(); 
		} 
		System.out.println("Invertido"); 
		for(int contador = 7; contador>=0; contador--) {
			System.out.println(arreglo[contador]);
		}
	}

}
