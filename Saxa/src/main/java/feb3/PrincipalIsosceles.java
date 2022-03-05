package feb3;

import java.util.Scanner;

public class PrincipalIsosceles {
	public static double mayorArea(TrianguloIsosceles[] triangulos) {
		double area = triangulos[0].obtenerArea();
		
		for (int iterador = 1; iterador < triangulos.length; iterador++) {
			if (triangulos[iterador].obtenerArea() > area) {
				area = triangulos[iterador].obtenerArea();
			}
		}
		return area;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double base, lado;
		int numeroTriangulos;

		System.out.println("Digite el numero de triangulos a ingresar");
		numeroTriangulos = entrada.nextInt();

		TrianguloIsosceles[] triangulos = new TrianguloIsosceles[numeroTriangulos];

		for (int iterador = 0; iterador < triangulos.length; iterador++) {
			System.out.println("\nIntroduce los valores para el triangulo " + (iterador + 1) + ":");
			System.out.println("Introduzca la base: ");
			base = entrada.nextDouble();
			System.out.println("Introduzca el lado: ");
			lado = entrada.nextDouble();

			triangulos[iterador] = new TrianguloIsosceles(base, lado);

			System.out.println("\nEl perimetro del triangulo es: " + triangulos[iterador].obtenerPerimetro());
			System.out.println("El area de un triangulo es: " + triangulos[iterador].obtenerArea());

		}
		System.out.println("\nEl area del triangulo de mayor superficie es: " + mayorArea(triangulos));
	}

}
