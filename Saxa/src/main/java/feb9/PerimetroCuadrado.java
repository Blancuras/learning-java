package feb9;
import java.util.Scanner;

public class PerimetroCuadrado {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		int lado; 
		int perimetro; 
		
		System.out.println("Introduce el lado del cuadrado: "); 
		lado = entrada.nextInt();
		
		perimetro = lado * 4; 
		
		System.out.println("El perimetro del cuadrado es: " + perimetro);
	}

}
