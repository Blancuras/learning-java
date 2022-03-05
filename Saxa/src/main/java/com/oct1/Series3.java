package com.oct1;

import java.util.Scanner;
//generar 765765765765
public class Series3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);  
		int num; 
		num = entrada.nextInt(); 
		int contador = 0; 
		int valorInicio = 7; 
		while(contador <= num) {
			System.out.println(valorInicio); 
			if(valorInicio > 5) {
				valorInicio--; 
			}else {
				valorInicio = 7; 
			} 
			contador++; 
		}
	}

}
