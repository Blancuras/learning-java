package com.sept30;

import java.util.Scanner;

public class SentenciaSwitch2 {

	public static void main(String[] args) {
		calculadoras();
		Scanner entrada = new Scanner(System.in); 
		System.out.println("CALCULADORA");
		System.out.println("1.suma");
		System.out.println("2.resta");
		System.out.println("3.multiplicacion");
		System.out.println("4.division");
		
		int menu = entrada.nextInt(); 
		double n1, n2, s, r, m, d; 
		
		switch(menu) {
		case 1: 
			System.out.println("suma"); 
			System.out.println("Ingresa un numero: "); 
			n1 = entrada.nextDouble(); 
			System.out.println("Ingresa otro numero"); 
			n2 = entrada.nextDouble(); 
			s = n1 + n2; 
			System.out.println("Respuesta: " + s); 
			break; 
		
		case 2: 
			System.out.println("resta"); 
			System.out.println("Ingresa un numero: "); 
			n1 = entrada.nextDouble(); 
			System.out.println("Ingresa otro numero"); 
			n2 = entrada.nextDouble(); 
			 r= n1 - n2; 
			System.out.println("Respuesta: " + r); 
			break; 
		
		case 3: 
			System.out.println("multipicacion"); 
			System.out.println("Ingresa un numero: "); 
			n1 = entrada.nextDouble(); 
			System.out.println("Ingresa otro numero"); 
			n2 = entrada.nextDouble(); 
			m = n1 * n2; 
			System.out.println("Respuesta: " + m); 
			break; 
		
		case 4: 
			System.out.println("division"); 
			System.out.println("Ingresa un numero: "); 
			n1 = entrada.nextDouble(); 
			System.out.println("Ingresa otro numero"); 
			n2 = entrada.nextDouble(); 
			d = n1 / n2; 
			System.out.println("Respuesta: " + d); 
			break; 
			
		}
	}
	
	private static void calculadoras() {
		Scanner entrada = new Scanner(System.in); 
		System.out.println("CALCULADORA mijail");
		System.out.println("1.suma");
		System.out.println("2.resta");
		System.out.println("3.multiplicacion");
		System.out.println("4.division");
		
		int menu = entrada.nextInt(); 
		double numero1, numero2;
		System.out.println("Ingresa un numero: "); 
		numero1 = entrada.nextDouble(); 
		System.out.println("Ingresa otro numero"); 
		numero2 = entrada.nextDouble(); 
		
		switch(menu) {
		case 1: 
			System.out.println("suma");
			System.out.println( numero1 + numero2);
			break;
		case 2: 
			System.out.println("resta");
			System.out.println( numero1 - numero2);
			break;
		case 3: 
			System.out.println("multiplicacion");
			System.out.println( numero1 * numero2);
			break;
		case 4: 
			System.out.println("div");
			System.out.println( numero1 / numero2);
			break;
		default:
			System.out.println("Invalida ");
			break;
		}	
	}
}
