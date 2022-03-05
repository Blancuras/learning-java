package enero27;

import java.util.Scanner;

public class Vector {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		
		int[]numero = new int [4];
		numero[0] = 1; 
		numero[1] = 2; 
		numero[2] = 3; 
		numero[3] = 4; 
//		numero[4] = 5;
//		numero[5] = 6;|
		
		for(int contador = 0; contador < numero.length; contador++) {
			System.out.print(numero[contador]); 
			entrada.close();
		}

	}

}
