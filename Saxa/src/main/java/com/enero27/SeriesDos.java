package com.enero27;

import java.util.Scanner;

public class SeriesDos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num;
		num= entrada.nextInt(); 
		int contador = 0; 
		int interruptor = 7;  
		while(contador <= num) {
			System.out.print(interruptor); 
			if(interruptor > 5) {
				interruptor --; 
			}else {
				interruptor = 7; 
			} 
			contador++; 
		} 
		entrada.close();
	}

}
