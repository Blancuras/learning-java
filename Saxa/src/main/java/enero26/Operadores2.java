package enero26;

import java.util.Scanner;

public class Operadores2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		int primerNum, ultimoNum; 
		System.out.println("Ingrese un numero");
		primerNum = entrada.nextInt();  
		
		ultimoNum = primerNum % 10; 
		System.out.println("El ultimo digito es: " + ultimoNum);
		entrada.close();
	}

}
