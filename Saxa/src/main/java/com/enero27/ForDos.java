package com.enero27;

//PEDIR UN NUMERO QUE DEBE DE ESTAR ENTRE 0 Y 10
//Y MOSTRAR LA TABLA DE MULTIPLICAR DE DICHO NUMERO
import java.util.Scanner;

public class ForDos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num;

		do {
			System.out.println("Ingrese un numero(0 a 10)");
			num = entrada.nextInt();
		} while (!(0 <= num && num <= 10));
		
		for (int contador = 1; contador <= 10; contador++) {
			System.out.println(num + " x " + contador + " = " + num * contador); 
			entrada.close();
		}
	}

}
