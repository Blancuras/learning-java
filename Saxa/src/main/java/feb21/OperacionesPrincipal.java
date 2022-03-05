package feb21;

import java.util.Scanner;

public class OperacionesPrincipal {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		NumeroComplejo primerNumero, segundoNumero;
		double a; // parte real del primer numero
		double b; // parte imaginaria del primer numero
		double c; // parte real del segundo numero
		double d; // parte imaginaria del segundo numero
		int opcion, numeroEntero;
		NumeroComplejo suma, multiplicacion;

		do {
			System.out.println("\n\tMenu");
			System.out.println("1.- Sumar 2 numeros complejos");
			System.out.println("2.- Multiplicar 2 numeros complejos");
			System.out.println("3.- Comprobar igualdad de 2 numeros complejos");
			System.out.println("4.- Multiplicar entero por complejo");
			System.out.println("5.- Salir");
			System.out.println("Digite una opcion: ");
			opcion = entrada.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("\nDigite la parte real del primer numero complejo");
				a = entrada.nextDouble();

				System.out.println("Digite la parte imagiaria: ");
				b = entrada.nextDouble();

				System.out.println("\nDigite la parte real del segundo numero complejo");
				c = entrada.nextDouble();

				System.out.println("Digite la parte imagiaria: ");
				d = entrada.nextDouble();

				primerNumero = new NumeroComplejo(a, b);
				segundoNumero = new NumeroComplejo(c, d);

				suma = primerNumero.calcularSuma(segundoNumero);
				System.out.println("\nLa suma es: " + suma.getParteReal() + " + " + suma.getParteImaginaria() + "i");

				break;
			case 2:
				System.out.println("\nDigite la parte real del primer numero complejo");
				a = entrada.nextDouble();

				System.out.println("Digite la parte imagiaria: ");
				b = entrada.nextDouble();

				System.out.println("\nDigite la parte real del segundo numero complejo");
				c = entrada.nextDouble();

				System.out.println("Digite la parte imagiaria: ");
				d = entrada.nextDouble();

				primerNumero = new NumeroComplejo(a, b);
				segundoNumero = new NumeroComplejo(c, d);

				multiplicacion = primerNumero.calcularProducto(segundoNumero);
				System.out.println("\nLa mltiplicacion es: " + multiplicacion.getParteReal() + " + "
						+ multiplicacion.getParteImaginaria() + "i");

				break;
			case 3:
				System.out.println("\nDigite la parte real del primer numero complejo");
				a = entrada.nextDouble();

				System.out.println("Digite la parte imagiaria: ");
				b = entrada.nextDouble();

				System.out.println("\nDigite la parte real del segundo numero complejo");
				c = entrada.nextDouble();

				System.out.println("Digite la parte imagiaria: ");
				d = entrada.nextDouble();

				primerNumero = new NumeroComplejo(a, b);
				segundoNumero = new NumeroComplejo(c, d);

				if (primerNumero.comprobarIgualdad(segundoNumero)) {
					System.out.println("\nLos numeros complejos son iguales");
				} else {
					System.out.println("Los numeros complejos no son iguales");
				}
				break;
			case 4:
				System.out.println("\nDigite la parte real del numero complejo");
				a = entrada.nextDouble();

				System.out.println("Digite la parte imagiaria: ");
				b = entrada.nextDouble();
				System.out.println("\nDigite el numero entero");
				numeroEntero = entrada.nextInt();
				primerNumero = new NumeroComplejo(a, b);
				multiplicacion = primerNumero.multiplicarPorEntero(numeroEntero);
				System.out.println("\nLa multiplicacion es: " + multiplicacion.getParteReal() + " + "
						+ multiplicacion.getParteImaginaria() + "i");
				break;
			case 5:
				System.out.println("\nGracias por participar");
				break;
			default:
				System.out.println("\nOpcion no disponible, vuelva a intentar");
				break;
			}
		} while (opcion != 5);

	}
}
