package com.switches;
import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digita un valor entero : "); 
		int a = sc.nextInt(); 
		
		if (a == 1)  {
			//bloque 1 
			System.out.println("paso por el bloque 1"); 
		} else if (a == 2) {
			//bloque 2 
			System.out.println("paso por el bloque 2"); 
		} else if (a == 3) {
			//bloque 3 
			System.out.println("paso por el bloque 3"); 
		} else if (a == 4) {
			//bloque 4 
			System.out.println("paso por el bloque 4"); 
		} else if (a == 5) {
			//bloque 5 
			System.out.println("paso por el bloque 5"); 
		} else {
			//bloque 6 
			System.out.println("paso por el bloque 6"); 
		}
		
		
		switch(a) {
		case 1: 
			//bloque 1
			System.out.println("paso por el bloque 1"); 
			break;  
		case 2: 
			//bloque 2
			System.out.println("paso por el bloque 2"); 
			break; 
		case 3: 
			//bloque 3
			System.out.println("paso por el bloque 3"); 
			break; 
		case 4: 
			//bloque 4
			System.out.println("paso por el bloque 4"); 
			break; 
		case 5: 
			//bloque 5
			System.out.println("paso por el bloque 5"); 
			break; 
		default:  
			//bloque 6
			System.out.println("paso por el bloque 6"); 
			break; 
		}
		
		
		
		
	}
}
