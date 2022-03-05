package feb24Ejercicio1;

import java.util.Scanner;

public class TestEmpleados {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Comercial comercial; // Creamos el objeto
		Repartidor repartidor;
		int opcion;

		do {
			System.out.println("\n\tAUMENTO DE EMPLEADOS");
			System.out.println("1.- Aumento de comercial");
			System.out.println("2.- Aumento de repartidor");
			System.out.println("3.- Salir");
			System.out.println("Seleccione una opcion");
			opcion = entrada.nextInt();

			switch (opcion) {
			case 1:
				String nombreComercial;
				double salarioComercial, comision;
				int edadComercial;

				System.out.println("Digite el nombre del comercial");
				nombreComercial = entrada.next();

				System.out.println("Digite el salario del comercial");
				salarioComercial = entrada.nextDouble();

				System.out.println("Digite la comision del comercial");
				comision = entrada.nextDouble();

				System.out.println("Digite la edad del comercial");
				edadComercial = entrada.nextInt();

				comercial = new Comercial(comision, nombreComercial, edadComercial, salarioComercial);
				System.out.println(comercial.toString());
				comercial.aumento();
				break;

			case 2:
				String nombreRepartidor, zona;
				double salarioRepartidor;
				int edadRepartidor;

				System.out.println("Digite el nombre del repartidor ");
				nombreRepartidor = entrada.next();

				System.out.println("Digite el salario del repartidor ");
				salarioRepartidor = entrada.nextDouble();

				System.out.println("Digite la edad del repartidor ");
				edadRepartidor = entrada.nextInt();

				System.out.println("Digite la zona del repartidor: ");
				zona = entrada.next();

				repartidor = new Repartidor(zona, nombreRepartidor, edadRepartidor, salarioRepartidor);
				System.out.println(repartidor.toString());
				repartidor.aumento();
				break;

			case 3: 
				System.out.println("\nGracias por participar");
				opcion = 3; 
				break;

			default: 
				System.out.println("\nOpcion no disponible");
				break;
			}

		} while (opcion != 3);

	}
}
