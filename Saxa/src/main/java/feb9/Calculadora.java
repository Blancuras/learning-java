package feb9;

import java.util.Scanner;


public class Calculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int opcion;
		int primerNumero;
		int segundoNumero;
		int resultado;

		System.out.println("Digite una opcion: ");
		System.out.println("1.- Sumar ");
		System.out.println("2.- Restar ");
		System.out.println("3.- Multiplicar ");
		System.out.println("4.- Dividir ");
		System.out.println("5.- Raiz cuadrada ");
		System.out.println("6.- Raiz cubica ");
		System.out.println("7.- Elevar al exponente ");
		System.out.println("8.- Hallar su porcentaje ");
		System.out.println("9.- Salir ");
		System.out.println("");
		System.out.println("Digite la opcion: ");
		opcion = entrada.nextInt();

		switch (opcion) {
		case 1:
			System.out.println("");
			System.out.println("Digite el primer numero: ");
			primerNumero = entrada.nextInt();

			System.out.println("Digite el primer numero: ");
			segundoNumero = entrada.nextInt();

			resultado = primerNumero + segundoNumero;
			System.out.println("");

			System.out.println("================================");
			System.out.println("La suma es: " + resultado);
			System.out.println("================================");
			break;

		case 2:
			System.out.println("");
			System.out.println("Digite el primer numero: ");
			primerNumero = entrada.nextInt();

			System.out.println("Digite el primer numero: ");
			segundoNumero = entrada.nextInt();

			resultado = primerNumero - segundoNumero;
			System.out.println("");

			System.out.println("================================");
			System.out.println("La resta es: " + resultado);
			System.out.println("================================");
			break;

		case 3:
			System.out.println("");
			System.out.println("Digite el primer numero: ");
			primerNumero = entrada.nextInt();

			System.out.println("Digite el primer numero: ");
			segundoNumero = entrada.nextInt();

			resultado = primerNumero * segundoNumero;
			System.out.println("");

			System.out.println("================================");
			System.out.println("La multiplicacion es: " + resultado);
			System.out.println("================================");
			break;

		case 4:
			System.out.println("");
			System.out.println("Digite el primer numero: ");
			primerNumero = entrada.nextInt();

			System.out.println("Digite el primer numero: ");
			segundoNumero = entrada.nextInt();

			if (segundoNumero == 0) {
				System.out.println("");
				System.out.println("============================");
				System.out.println("No se divide entre cero");
				System.out.println("============================");

			} else {
				resultado = primerNumero / segundoNumero;
				System.out.println("================================");
				System.out.println("La division es: " + resultado);
				System.out.println("================================");
			}
			break;

		case 5:

			System.out.println("");
			System.out.println("Digite el primer numero: ");
			primerNumero = entrada.nextInt();

			resultado = (int) Math.sqrt(primerNumero);
			System.out.println("================================");
			System.out.println("La raiz cuadrada es: " + resultado);
			System.out.println("================================");
			break;

		case 6:
			System.out.println("");
			System.out.println("Digite el primer numero: ");
			primerNumero = entrada.nextInt();

			resultado = (int) Math.cbrt(primerNumero);

			System.out.println("");
			System.out.println("================================");
			System.out.println("La raiz cubica es: " + resultado);
			System.out.println("================================");
			break;

		case 7:
			System.out.print("Digite la base (primer numero) : ");
			primerNumero = entrada.nextInt();

			System.out.print("Digite el exponente: ");
			segundoNumero = entrada.nextInt();

			resultado = (int) Math.pow(primerNumero, segundoNumero);
			System.out.println("");
			System.out.println("================================");
			System.out.println(+primerNumero + " Elevado al exponente " + segundoNumero + " es " + resultado);
			System.out.println("================================");
			break;

		case 8:
			System.out.println("Digite el numero : ");
			primerNumero = entrada.nextInt();
			System.out.print("Digite el porcentaje");
			segundoNumero = entrada.nextInt();
			resultado = (segundoNumero / 100) * primerNumero;
			System.out.println("");
			System.out.println("================================");
			System.out.println("El " + segundoNumero + " % es: " + primerNumero);
			System.out.println("================================");
			break;

		case 9:
			System.out.println("");
			System.out.println("================================");
			System.out.println("Usted ha salido de la calculadora");
			System.out.println("================================");
			break;

		default:
			System.out.println("Opcion no disponible");
			break;

		}

	}

}
