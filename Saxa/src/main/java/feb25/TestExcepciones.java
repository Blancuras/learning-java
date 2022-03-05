package feb25;

import java.util.Scanner;

public class TestExcepciones {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		int valor; 
		
		try {
			// tratamos 
			System.out.println("Digite un valor "); 
			valor = entrada.nextInt(); 
			
			System.out.println("El valor es: " + valor); 
		}catch(Exception excepcion) {
			System.out.println("Ocurrio una excepcion");
			excepcion.printStackTrace(System.out);
		}finally {
			System.out.println("Cerramos el programa ");  
		}
		
		
		
		/*int primerNumero = 9; 
		int segundoNumero = 0; 
		
		try {
			int division = primerNumero / segundoNumero;  
			System.out.println("La division es: " + division);
		}catch(Exception excepcion) {
			System.out.println("Ocurrio una excepcion");
			excepcion.printStackTrace(System.out);
		}*/
		
			
		//Dividir un numero entre 0 
		/*int primerNumero = 10; 
		int segundoNumero = 0; 
		
		int division = primerNumero / segundoNumero; */
	}
}
