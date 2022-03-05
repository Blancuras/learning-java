package feb9;
import java.util.Scanner;

public class CalcularEdad {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		int fechaActual; 
		int fechaNacimiento; 
		int edad;  
		
		System.out.println("Digite la fecha actual ");
		fechaActual = entrada.nextInt(); 
		
		System.out.println("Digite la fecha de nacimiento de la persona :"); 
		fechaNacimiento = entrada.nextInt();  
		
		edad = fechaActual - fechaNacimiento; 
		System.out.println("La edad de la persona es: " + edad);  
	}

}
