package com.oct1;

import java.util.Scanner;
// generar 4, 7, 10, 13
public class Series2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);  
		int num; 
		System.out.println("Ponmelas ");
		num = entrada.nextInt(); 
		int contador1 = 1; //Genera la serie
		int contador2 = 4; //Identifica los valores que se requieren
		while (contador1 <= num) {
			System.out.println(contador2);
			contador1++;
			contador2+=3; 
		}

	}

}
