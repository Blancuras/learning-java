package com.oct1;

import java.util.Scanner;
//Pedir un numero que debe estar entre 0 y 10
// y mostrar la tabla de multiplicar de dicho numero
public class CicloFor5 {

	public static void main(String[] args) {
//		System.out.println( !(true && true));
		Scanner entrada = new Scanner(System.in);  
		int num; 
		do {
			System.out.println("Ingrese un numero(0 a 10)");
			num = entrada.nextInt(); 
//		}while(0 >= num && num>=10); 
		}while(!(0 <= num && num<=10));
		
		for(int contador = 1; contador <=10; contador++) {
			System.out.println(num + " x " + contador + " = " + num * contador);
		}
	}

}
