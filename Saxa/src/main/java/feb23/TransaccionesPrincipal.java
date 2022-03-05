package feb23;

import java.util.Scanner;

public class TransaccionesPrincipal {

	// CReamos un metodo para buscar el numero de cuenta
	public static int buscarNumeroDeCuenta(Cuenta cuentas[], int numeroDeCuentaABuscar) {
		int indice = 0;
		int iterador = 0;
		boolean numeroDeCuentaEncontrada = false;

		while ((iterador < cuentas.length) && (numeroDeCuentaEncontrada == false)) {
			if (cuentas[iterador].getNumeroCuenta() == numeroDeCuentaABuscar) {
				numeroDeCuentaEncontrada = true;
				indice = iterador;
			}
			iterador++;
		}
		if (numeroDeCuentaEncontrada == false) {
			indice = -1;
		}
		return indice;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nombre, apellido, curp;
		Cuenta cuentas[];
		Cliente cliente;
		int numeroCuenta, cantidadCuentas, opcion, indiceNumeroCuenta;
		double saldo, cantidadDinero;

		// Pedimos los datos del cliente
		System.out.print("Digite el nombre del cliente ");
		nombre = entrada.next();

		System.out.print("Digite apellido del cliente: ");
		apellido = entrada.next();

		System.out.print("Digite curp del cliente ");
		curp = entrada.next();

		System.out.print("\nDigite la cantidad de cuentas que tiene el cliente");
		cantidadCuentas = entrada.nextInt();

		System.out.println("");
		cuentas = new Cuenta[cantidadCuentas];

		// Rellenamos las cuentas
		for (int iterador = 0; iterador < cuentas.length; iterador++) {
			System.out.println("\nDigite la  " + (iterador + 1) + "° cuenta: ");

			System.out.println("Digite el numero de cuenta ");
			numeroCuenta = entrada.nextInt();

			System.out.println("Digite el saldo de la cuenta");
			saldo = entrada.nextDouble();
			System.out.println("");
			cuentas[iterador] = new Cuenta(numeroCuenta, saldo);
		}
		cliente = new Cliente(nombre, apellido, curp, cuentas); // Hacemos una instancia

		do {
			System.out.println("\n\tMENU");
			System.out.println("1.-Consultar saldo de la cuenta ");
			System.out.println("2.- Infresar saldo a la cuenta");
			System.out.println("3.- Retirar saldo de la cuenta");
			System.out.println("4.- Salir");
			System.out.print("Digite una opcion: ");
			opcion = entrada.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("\nDigite el numero de cuenta ");
				numeroCuenta = entrada.nextInt();
				indiceNumeroCuenta = buscarNumeroDeCuenta(cuentas, numeroCuenta);
				if (indiceNumeroCuenta == -1) {
					System.out.println("\nCuenta no encontrada, verifique su numero de cuenta");
				} else {
					System.out.println("Digite la cantidad a depositar");
					cantidadDinero = entrada.nextDouble();
					cliente.ingresarDinero(indiceNumeroCuenta, cantidadDinero);
					System.out.println("\nDeposito con exito");
					System.out.println("Saldo disponible: " + cliente.consultarSaldo(indiceNumeroCuenta));
				}
				break;

			case 2:
				System.out.println("\nDigite el numero de cuenta ");
				numeroCuenta = entrada.nextInt();
				indiceNumeroCuenta = buscarNumeroDeCuenta(cuentas, numeroCuenta);
				if (indiceNumeroCuenta == -1) {
					System.out.println("\nNo existe un ana cuenta con ese numero");
					System.out.println("");
				} else {
					System.out.print("\nDigite la cantidad de dinero a retirar: ");
					cantidadDinero = entrada.nextDouble();
					if (cliente.consultarSaldo(indiceNumeroCuenta) < cantidadDinero) {
						System.out.print("\nSaldo Insuficiente");
						System.out.print("");
					} else {
						cliente.retirarDinero(indiceNumeroCuenta, cantidadDinero);
						System.out.println(
								"Saldo disponible de la cuenta : " + cliente.consultarSaldo(indiceNumeroCuenta));
						System.out.println("Retiro con exito");
						System.out.println("");
					}
				}
				break;

			case 3:
				System.out.println("\nDigite el numero de cuenta ");
				numeroCuenta = entrada.nextInt();
				indiceNumeroCuenta = buscarNumeroDeCuenta(cuentas, numeroCuenta);
				if (indiceNumeroCuenta == -1) {
					System.out.println("\nNo existe un ana cuenta con ese numero");
					System.out.println("");
				} else {
					System.out.println("Saldo disponible : " + cliente.consultarSaldo(indiceNumeroCuenta));
					System.out.println("");
				}
				break;

			case 4:
				System.out.println("\nGracias por participar");
				opcion = 4;
				break;

			default:
				System.out.println("\nOpcion no disponible, vuelva a digitar");
				break;
			}

		} while (opcion != 4);
	}

}
