package enero17;

import java.util.Scanner;

public class CondicionalDoble {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Digita un valor entero : ");
		int num = scanner.nextInt();

		if (num >= 0) {
			// Bloque true
			System.out.println("Es un valor positivo");
		} else { 
			//Bloque false
			System.out.println("Es un valor negativo");
		}
			System.out.println("La variable num vale : " + num); 
			scanner.close();
			
		}
	}


