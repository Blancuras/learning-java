/*
 * Hacer un programa para calcular el area de Poligonos(Triangulos y Rectangulos) 
 * el programa debe ser capaz de almacenar en un arreglo N triangulos y rectangulos, y al final
 * mostrar el area y los datos de cada uno. Para ello se tendra lo siguiente. 
 * - Una super clase llamada Poligono. 
 * -Una sub clase llamada Rectangulo. 
 * -Una su clase llamada Triangulo.
 */
package com.oct19;

import java.util.ArrayList;
import java.util.Scanner;

public class PrincipalPoligono {
	static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		// Llenar poligono
		llenarPoligono();
		
		//mostrar los datos y el area de cada poligono
		mostrarResultados(); 
	}

	public static void llenarPoligono() {
		char respuesta;
		int opcion;
		do {
			do {
				System.out.println("Digite que poligono desea");
				System.out.println("1.Triangulo");
				System.out.println("2. Rectangulo");
				System.out.println("Opcion: ");
				opcion = entrada.nextInt();
			} while (opcion < 1 || opcion > 2);

			switch (opcion) {
			case 1:
				llenarTriangulo(); // Llenar un triangulo
				break;
			case 2:
				llenarRectangulo(); // Llenar un rectangulo
				break;
			}
			System.out.println("\nDesea introducir otro poligono(s/n): ");
			respuesta = entrada.next().charAt(0);
			System.out.println("");
		} while (respuesta == 's' || respuesta == 'S');

	}

	public static void llenarTriangulo() {
		double lado1, lado2, lado3;
		System.out.println("\nDigite el lado 1 del triangulo ");
		lado1 = entrada.nextDouble();
		System.out.println("\nDigite el lado 2 del triangulo ");
		lado2 = entrada.nextDouble();
		System.out.println("\nDigite el lado 3 del triangulo ");
		lado3 = entrada.nextDouble();

		Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

		// Guardamos un triangulo dentro de nuestro arreglo de poligonos
		poligono.add(triangulo);
	}

	public static void llenarRectangulo() {
		double lado1, lado2;
		System.out.println("\nDigite el lado 1 del rectangulo: ");
		lado1 = entrada.nextDouble();
		System.out.println("Digite el lado 2 del rectangulo: ");
		lado2 = entrada.nextDouble();

		Rectangulo rectangulo = new Rectangulo(lado1, lado2);
		poligono.add(rectangulo);
	} 
	public static void mostrarResultados() { 
		//Recorriendo el arreglo de poligonos
		for(Poligono poli: poligono) {
			System.out.println(poli.toString());
			System.out.println("Area = " + poli.area()); 
			System.out.println("");
		}
	}
}
