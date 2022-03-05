package feb10;

import java.util.Scanner;

public class MultiploDe3ODe5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		int numero; 
		
		System.out.println("Digite un numero: "); 
		numero = entrada.nextInt(); 
		
		if(numero % 3 ==0 || numero % 5 ==0) { 
			System.out.println("El numero es multiplo de 3 o 5");
			
		} else {
			System.out.println("El numero no es multiplo de los numeros");
		}
		
	}

}
