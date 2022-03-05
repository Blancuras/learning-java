package enero17;

import java.util.Scanner;

public class Contadores {

	public static void main(String[] args) {
		int contador = 0;  //Creo el contador
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese su nombre: ");
		String nombre = scanner.nextLine();
		System.out.print("Ingrese su edad: ");
		int edad = scanner.nextInt();
		contador++;   //Cuento - incremento el contador
		System.out.println("La cantidad es: " + contador);  //mostrar la cuenta 
		scanner.close(); 
	}

}
