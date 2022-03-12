package com.feb10;

import java.util.Scanner;

public class CajeroAutomaticoConContrasena {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int opcion;
		String contrasena;
		int saldoInicial = 2000;
		int deposito, retiro;
		int intentos = 0;
		int continuar = 0;
		boolean salir = false;
		int saldoActual;

		do {
			System.out.println("Digite su contrasena: ");
			contrasena = entrada.next();

			if (contrasena.equals("Holamundo")) {
				while (!salir) { // true

					System.out.println("");

					System.out.println("Bienvenido a su cajero");
					System.out.println("Digite una opcion :");
					System.out.println("1.- Depositar");
					System.out.println("2.- Retirar");
					System.out.println("3.- Consultar Saldo");
					System.out.println("4.- Salir");

					System.out.print("Digite una opcion");
					opcion = entrada.nextInt();

					switch (opcion) {
					case 1:
						System.out.print("");
						System.out.print("Digite la cantidad que desea depositar");
						deposito = entrada.nextInt();

						saldoActual = saldoInicial + deposito;
						System.out.println("Su saldo actual es: " + saldoActual);
						System.out.println("Depositaste " + deposito);
						saldoInicial = saldoActual;
						break;

					case 2:
						System.out.println("");
						System.out.println("Digite la cantidad que desea retirar:");
						retiro = entrada.nextInt();

						if (retiro > saldoInicial) {
							System.out.println("Saldo insuficiente");
						} else {
							saldoActual = saldoInicial - retiro;
							saldoInicial = saldoActual;
							System.out.println("Retitaste: " + retiro);
							System.out.println("Su saldo actual es: " + saldoInicial);
						}
						System.out.println("");
						break; 
						
					case 3: 
						System.out.println("");
						System.out.println("Su saldo actual es : " + saldoInicial);
						break; 
						
					case 4: 
						salir = true; 
						continuar = 1; 
						System.out.println("Gracias!!");
						break; 
						
					default: 
						System.out.println(""); 
						System.out.println("Opcion no disponible");  
						System.out.println("");
						break; 

					}
				}
			} else {
				System.out.println("");
				System.out.println("La contrasena es incorrecta");
				intentos++;
				System.out.println("");
			}
			if (intentos == 3) {
				System.out.println("");
				System.out.println("Usted ha intetado mas de 3 veces, verifique su contrasena ");
				break;
			}

		} while (continuar == 0);

	}

}
