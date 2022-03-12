package com.enero31;

import java.util.ArrayList;
import java.util.Scanner;
//ESta es nuestra calse principal en donde se accede a al programa

public class TerrenoPrincipal {
	static Scanner entrada = new Scanner(System.in);
	static ArrayList<Terreno> pedazoTerreno = new ArrayList<Terreno>();

	//Este es el metodo principal
	public static void main(String[] args) {
		char respuesta;
		int opcion;
		do {
			System.out.println("Que tipo de pedazo de terreno quieres ingresar");
			System.out.println("1: Triangulo");
			System.out.println("2: Rectangulo");
			opcion = entrada.nextInt();
			switch (opcion) {
			case 1:
				llenaTriangulo();
				break;
			case 2:
				llenaRectangulo();

			}

			System.out.println("Deseas meter mas  pedazos de terreno a calcular s/n");
			respuesta = entrada.next().charAt(0);
		} while (respuesta == 's' || respuesta == 'S');
		mostrarResultados();
	}
	//Este metodo se encarga de recibir desde scanner 3 numeros y colocarlos en la
	//instancia (hija) Trianguloy esa instancia agregarla al arreglo de terrenos
	protected static void llenaTriangulo() {
		double lado1, lado2, lado3;
		System.out.println("Que medida tiene tu lado 1 de tu triangulo");
		lado1 = entrada.nextDouble();
		System.out.println("Que medida tiene tu lado 2 de tu triangulo");
		lado2 = entrada.nextDouble();
		System.out.println("Que medida tiene tu lado 3 de tu triangulo");
		lado3 = entrada.nextDouble();
		Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
		pedazoTerreno.add(triangulo);
	}

	//Este metodo se encarga de recibir desde scanner 3 numeros y colocarlos en la
		//instancia (hija) rectangulo y esa instancia agregarla al arreglo de terrenos
	protected static void llenaRectangulo() {
		double lado1, lado2;
		System.out.println("Que medida tiene tu lado 1 de tu rectangulo");
		lado1 = entrada.nextDouble();
		System.out.println("Que medida tiene tu lado 2 de tu rectangulo");
		lado2 = entrada.nextDouble();
		Rectangulo rectangulo = new Rectangulo(lado1, lado2);
		pedazoTerreno.add(rectangulo);
	}
	
	//Se muestran los datos del area de cada instancia hija y el area total
	private static void mostrarResultados() {
		double area = 0; 
		for(Terreno terreno: pedazoTerreno) {
			System.out.println(terreno.toString() + "Area" + terreno.area()); 
			area = area + terreno.area(); 
		} 
		System.out.println("El area total de tu terreno es: ");
	}
}
