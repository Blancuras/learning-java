package feb9;

import java.util.Scanner;

public class PromedioAlumno {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int nota1;
		int nota2;
		int nota3;
		int nota4;
		int nota5;
		int promedio;

		System.out.println("Introduce la primera nota: ");
		nota1 = entrada.nextInt();

		System.out.println("Introduce la segunda nota: ");
		nota2 = entrada.nextInt();

		System.out.println("Introduce la tercera nota: ");
		nota3 = entrada.nextInt();

		System.out.println("Introduce la cuarta nota: ");
		nota4 = entrada.nextInt();

		System.out.println("Introduce la quinta nota: ");
		nota5 = entrada.nextInt(); 
		
		promedio = (nota1 + nota2 + nota3 + nota4 + nota5) /5;  
		System.out.println("El promedio es: " + promedio);

	}

}
