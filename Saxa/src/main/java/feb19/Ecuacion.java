package feb19;

import java.util.Scanner;

public class Ecuacion {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		double ladoA; 
		double ladoB; 
		double ladoC; 
		boolean estado = true; 
		String respuesta;  
		Raices raiz; 
		int contador = 0; 
		
		
		for(int indice = 0; estado;indice++) {
			System.out.println("Digite el valor de a: "); 
			ladoA = entrada.nextDouble();  
			
			System.out.println("Digite el valor de b: "); 
			ladoB = entrada.nextDouble(); 
			
			System.out.println("Digite el valor de c: "); 
			ladoC = entrada.nextDouble(); 
			
			System.out.println(""); 
			
			raiz = new Raices(ladoA, ladoB, ladoC); 
			raiz.calcular(); 
			
			System.out.println("");  
			System.out.println("Desea continuar?"); 
			respuesta = entrada.next(); 
			
			System.out.println("");
			
			if(respuesta.equalsIgnoreCase("Si")) {
				contador++; 
				estado = true; 
			}
		} /*else {
			contador++;
		System.out.println("La cantidad de veces que usted calculo la ecuacion es " + contador);  
			estado = false; 
		}*/
		
	}

} 

