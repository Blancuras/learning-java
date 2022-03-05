package enero17;

import java.util.Scanner;

public class OperadoresTernarios {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Digita un valor entero : "); 
		int numero = scanner.nextInt(); 
		
		String tipoDeNumero = ""; 
		
		if(numero >=0) {
			tipoDeNumero = "Valor positivo";
		}else {
			tipoDeNumero = "Valor negativo"; 
		} 
		System.out.println(tipoDeNumero); 
		
//		true ? primeraparte : ;
//		false  ?   : segundaParte;
		
		tipoDeNumero = numero >= 0 ? "Valor positivo " : "Valor negativo"; 
		System.out.println(tipoDeNumero); 
		
		System.out.println("La variable numero vale : " + numero); 
		scanner.close();
		
		
	}

}
