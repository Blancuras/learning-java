package com.oct6;

import java.util.Scanner;

public class SwitchMethod {

	public static void main(String[] args) {
		System.out.println("Que dia de la semana es (Lunes = 1 - Domingo = 7)?:");

		Scanner entrada = new Scanner(System.in);
		int diaDeLaSemana = entrada.nextInt();
		entrada.close();
		switch (diaDeLaSemana) {
		case 1:
			System.out.println("Principio de semana, bien merecido, no voa trabajar");
			Metodo.mihail();
			break;
		case 2:
			System.out.println("Es martes de drama");
			break;
		case 3:
			System.out.println("Es miercoles de accion");
			break;
		case 4:
			System.out.println("Es jueves de animadas");
			break;
		case 5:
			System.out.println("Es viernes de terror");
			break;
		case 6:
			System.out.println("Es sabado de documentales");
			break;
		case 7:
			System.out.println("Es domingo de comodin");
			break;
		default:
			System.out.println("En que dia vives?");
		}

	}

}
