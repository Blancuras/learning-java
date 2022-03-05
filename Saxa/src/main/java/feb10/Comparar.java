package feb10;

import java.util.Scanner;

public class Comparar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		
		String cadena1; 
		String cadena2; 
		
		System.out.println("Digite la primer cadena: "); 
		cadena1 = entrada.next(); 
		
		System.out.println("Digite la segunda cadena: "); 
		cadena2 = entrada.next(); 
		
		if (cadena1.equalsIgnoreCase(cadena2)) {
			System.out.println("Las cadenas son iguales");
		} else {
			System.out.println("Las cadenas no son iguales");
		}
	}

}
