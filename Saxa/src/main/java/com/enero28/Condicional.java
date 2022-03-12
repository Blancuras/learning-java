package com.enero28;

import java.util.Scanner;

public class Condicional {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numUsuario, numSistema;
		numSistema =(int)(Math.random()*10); 
		System.out.println("Ingresa este numero " + numSistema+ ":"); 
		numUsuario = entrada.nextInt(); 
		if(numUsuario == numSistema) {
			System.out.println("Muy bien");
		} else {
			System.out.println("Muy mal");
		} 
		entrada.close();
	}

}
