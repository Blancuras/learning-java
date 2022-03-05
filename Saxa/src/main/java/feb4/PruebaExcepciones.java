package feb4;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PruebaExcepciones {

	public static void main(String[] args) {
		/*
		 * int num1 = 5, num2 = 0;
		 * 
		 * int resultado = num1 / num2; System.out.println("El resultado es " +
		 * resultado);
		 */

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingresa un numero");
		try {
			int numero = entrada.nextInt();
			System.out.println(numero);			
			System.out.println("SE termino de ejecutar el programa");
		}catch (Exception e) {
			System.out.println("Hubo un erro en la entrada de datos");
			System.out.println("eviar email de error");
		}
	}

}
