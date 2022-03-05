package com.oct18;

import java.util.Scanner;

public class PrincipalTriangulo {
	
	public static double obtenerMayorArea(TianguloIsosceles[] triangulos) {
		double area = triangulos[0].obtenerArea();
		
		for (int indice = 1; indice < triangulos.length; indice++) {
			double areaNuevoTriangulo = triangulos[indice].obtenerArea();
			
			if (areaNuevoTriangulo > area) {
				area = areaNuevoTriangulo;
			}
		} 
		return area; 
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double base, lado;
		int numTriangulos;

		System.out.println("Digite el numero de trinagulos a ingresar: ");
		numTriangulos = entrada.nextInt();

		TianguloIsosceles[] triangulos = new TianguloIsosceles[numTriangulos];
		for (int indice = 0; indice < triangulos.length; indice++) {
			System.out.println("\nDigite los valores para el triangulo: " + (indice + 1));
			System.out.print("Introduzca la base: ");
			base = entrada.nextDouble();
			System.out.print("Introduzca el lado: ");
			lado = entrada.nextDouble();

			triangulos[indice] = new TianguloIsosceles(base, lado);

			System.out.println("\nEl perimetro del triangulo es: " + triangulos[indice].obtenerPerimetro());
			System.out.println("El area del triangulo es: " + triangulos[indice].obtenerArea());
		} 
		entrada.close();
		System.out.println("\nEl area del triangulo de mayor superficie es: " + obtenerMayorArea(triangulos));
	}

}
