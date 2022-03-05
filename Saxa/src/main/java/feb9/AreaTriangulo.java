package feb9;
import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double baseTriangulo;
		double alturaTriangulo;
		double areaTriangulo;

		System.out.println("Digita la base del triangulo : ");
		baseTriangulo = entrada.nextDouble(); 
		
		System.out.println("Digita la altura del triangulo : "); 
		alturaTriangulo = entrada.nextDouble();  
		
		areaTriangulo = (baseTriangulo * alturaTriangulo) / 2; 
		System.out.println("El area del triangulo es: " + areaTriangulo);
		
		
	}

}
