package com.sept30;

import java.util.Scanner;

public class SentenciaSwitch {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa un numero");
		int semana = entrada.nextInt();

		String dia;
		switch (semana) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Lunes";
			break;
		case 3:
			dia = "Martes";
			break;
		case 4:
			dia = "Miercoles";
			break;
		case 5:
			dia = "Jueves";
			break;
		case 6:
			dia = "Viernes";
			break;
		case 7:
			dia = "Sabado";
			break;
			default: 
				dia = "No existe ese dia"; 
		} 
		System.out.println("El dia " + semana + ", es " + dia);
		
		
	}

}
