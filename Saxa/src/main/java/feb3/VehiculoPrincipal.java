package feb3;

import java.util.Scanner;

public class VehiculoPrincipal {
	public static int indiceCocheMasBarato(Vehiculo[] coches) { // le pasamos un arreglo de objetos de la clase
																// vehiculos
		int indice = 0;
		float precio= coches[0].getPrecio(); // El primer precio que encuntre lo pondra aqui
		for (int index = 0; index < coches.length; index++) {
			if (coches[index].getPrecio() < precio) {
				precio = coches[index].getPrecio();
				indice = index;
			}
		}
		return indice;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String marca, modelo;
		float precio;
		int numeroVehiculos, indiceBarato;

		System.out.print("Digite la cantidad de Vehiculos: ");
		numeroVehiculos = entrada.nextInt();

		// Creamos los objetos para los coches
		Vehiculo coches[] = new Vehiculo[numeroVehiculos];

		for (int iterador = 0; iterador < coches.length; iterador++) {
			entrada.nextLine();
			System.out.println("\nDigite las caracteristicas del coche " + (iterador + 1) + ":");
			System.out.println("Introduzca marca");
			marca = entrada.nextLine();
			System.out.println("Introduzca modelo");
			modelo = entrada.nextLine();
			System.out.println("Introduzca precio: ");
			precio = entrada.nextFloat();

			coches[iterador] = new Vehiculo(marca, modelo, precio);
		}
		indiceBarato = indiceCocheMasBarato(coches);
		System.out.println("\nEl coche mas barato es: ");
		System.out.println(coches[indiceBarato].mostrarDatos());

	}

}
