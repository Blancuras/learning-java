package com.feb10;

import java.util.Scanner;

public class CajeroAutomatico {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcion;
		int saldoInicial = 120000;
		int saldoActual;
		int deposito, retiro;

		mostrarMenuInicial();
		
		opcion = entrada.nextInt();

		switch (opcion) {
		case 1:
			depositar(entrada, saldoInicial);
			break;

		case 2:
			retirar(entrada, saldoInicial);
			break;

		case 3:
			consularSaldo(saldoInicial);
			break;

		case 4:
			salir();
			break;

		default:
			System.out.println("Opcion no disponible");
			break;
		}

	}

	private static void mostrarMenuInicial() {
		System.out.println("Digite una opcion: ");
		System.out.println("1.- Depositar");
		System.out.println("2.- Retirar");
		System.out.println("3.- Consultar saldo");
		System.out.println("4.- Salir");

		System.out.println("");
		System.out.println("Digite una opcion");
	}

	private static void salir() {
		System.out.println("");
		System.out.println("Se ha retirado del cajero automatico");
	}

	private static void consularSaldo(int saldoInicial) {
		System.out.println("Su saldo actual es: " + saldoInicial);
	}

	private static void retirar(Scanner entrada, int saldoInicial) {
		int saldoActual;
		int retiro;
		System.out.println("");
		System.out.println("Digite la cantidad que desea retirar: ");
		retiro = entrada.nextInt();

		if (retiro > saldoInicial) {
			System.out.println("");
			System.out.println("No tiene suficiente dinero");
		} else {
			saldoActual = saldoInicial - retiro;
			saldoInicial = saldoActual;
			System.out.println("");
			System.out.println("================================");
			System.out.println("Retiraste : " + retiro);
			consularSaldo(saldoActual);
			System.out.println("================================");

		}
	}

	private static void depositar(Scanner entrada, int saldoInicial) {
		int saldoActual;
		int deposito;
		System.out.println("");
		System.out.println("Digite la cantidad que desea depositar: ");
		deposito = entrada.nextInt();

		saldoActual = saldoInicial + deposito;
		saldoInicial = saldoActual;

		System.out.println("");
		System.out.println("================================");
		System.out.println("Depositaste : " + deposito);
		consularSaldo(saldoActual);
		System.out.println("================================");
	}

}
