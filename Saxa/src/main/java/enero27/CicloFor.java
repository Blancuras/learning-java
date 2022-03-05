package enero27;

import java.util.Scanner;

public class CicloFor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		int num, sumaTotal = 0; 
		
		for(int contador = 1; contador <= 5; contador++) {
			System.out.println("Ingrese un numero"); 
			num = entrada.nextInt(); 
			sumaTotal = sumaTotal +  num; 
		} 
		System.out.println("suma total es: " + sumaTotal); 
		entrada.close();
	}

}
