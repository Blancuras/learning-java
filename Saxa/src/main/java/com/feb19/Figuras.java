package com.feb19;

import java.util.Scanner;

public class Figuras {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Perimetro perimetro = new Perimetro();
		Areas area = new Areas();
		Heron heron = new Heron(); //instancia

		int opcion;

		do {
			System.out.println("\n\tMENU");
			System.out.println("1.- Areas");
			System.out.println("2.- Perimetros");
			System.out.println("3.- Ley de Heron");
			System.out.println("4.-Salir");
			System.out.println("Digite una opcion: ");
			opcion = entrada.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("\n\tMENU DE AREAS");
				System.out.println("1.- Cuadrado");
				System.out.println("2.- Circulo");
				System.out.println("3.- Triangulo");
				System.out.println("4.- Rectangulo");
				System.out.println("Digite una opcion");
				int eleccionArea = entrada.nextInt();

				switch (eleccionArea) {
				case 1:
					System.out.println("\nDigite un lado");
					float lado = entrada.nextFloat();

					float areaCuadrado = area.calcularAreaCuadrado(lado);
					System.out.println("\nEl area del cuadrado es : " + areaCuadrado);
					break;

				case 2:
					System.out.println("\nDigite el radio: ");
					float radio = entrada.nextFloat();

					float areaCirculo = area.calcularAreaCirculo(radio);
					System.out.println("\nEl area del circulo es: " + areaCirculo);
					break;

				case 3:
					System.out.println("\nDigite la base: ");
					float base = entrada.nextFloat();

					System.out.println("Digite la altura: ");
					float altura = entrada.nextFloat();

					float areaTriangulo = area.calcularAreaTriangulo(base, altura);
					System.out.println("\nEl area del triangulo es: " + areaTriangulo);
					break;

				case 4:
					System.out.println("\nDigite la base: ");
					float baseRectangulo = entrada.nextFloat();

					System.out.println("\nDigite la altura: ");
					float alturaRectangulo = entrada.nextFloat();

					float areaRectangulo = area.calcularAreaRectangulo(baseRectangulo, alturaRectangulo);
					System.out.println("\nEl area del rectangulo es: " + areaRectangulo);
					break;
				default:
					System.out.println("\nLa opcion no existe, vuleva a digitar");
					break;
				}

				break;

			case 2:
				System.out.println("\n\tMENU DE PERIMETROS");
				System.out.println("1.- Cuadrado");
				System.out.println("2.- Circulo");
				System.out.println("3.- Triangulo");
				System.out.println("4.- Rectangulo");
				System.out.println("Digite una opcion");
				int eleccionPerimetro = entrada.nextInt();

				switch (eleccionPerimetro) {
				case 1:
					System.out.println("\nDigite un lado");
					float lado = entrada.nextFloat();

					float perimetroCuadrado = perimetro.calcularPerimetroCuadrado(lado);
					System.out.println("\nEl perimetro del cuadrado es: " + perimetroCuadrado);
					break;

				case 2:
					System.out.println("\nDigite el diametro: ");
					float diametro = entrada.nextFloat();

					float perimetroCirculo = perimetro.calcularPerimetroCirculo(diametro);
					System.out.println("\nEl perimetro del circulo es : " + perimetroCirculo);
					break;

				case 3:
					System.out.print("\nDigite el primer lado: ");
					float lado1 = entrada.nextFloat();

					System.out.print("\nDigite el segundo lado: ");
					float lado2 = entrada.nextFloat();

					System.out.print("\nDigite el tercer lado: ");
					float lado3 = entrada.nextFloat();

					float perimetroTriangulo = perimetro.calcularPerimetroTriangulo(lado1, lado2, lado3);

					break;
				case 4:
					System.out.println("\nDigite la base: ");
					float baseRectangulo = entrada.nextFloat();

					System.out.println("\nDigite la altura: ");
					float alturaRectangulo = entrada.nextFloat();
					
					float perimetroRectangulo = perimetro.calcularPerimetroRectangulo(baseRectangulo, alturaRectangulo);
					System.out.println("\nEperimetro del rectangulo es: " + perimetroRectangulo);
					break;
				default:
					System.out.println("\n La opcion no existe,  vuelva a digitar");
				}

				break;

			case 3:
				float a, b, c; 
				System.out.print("\nDigite el primer lado: ");
				a = entrada.nextFloat(); 
				
				System.out.print("Digite el segundo lado: "); 
				b = entrada.nextFloat(); 
				
				System.out.print("\nDigite el tercer lado: ");
				c = entrada.nextFloat();  
				
				float leyHeron = heron.calcularLeyDeHeron(a, b, c);
				System.out.println("\nLa ley de heron es: " + leyHeron);
				break;

			case 4:
				opcion = 4;
				System.out.println("\nGracias por participar!!");
				break;

			default:
				System.out.println("\nOpcion no disponible");
				System.out.println("");
				break;
			}

		} while (opcion != 4);
	}

}
