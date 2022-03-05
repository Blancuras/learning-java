package com.condicionales;
import java.util.Scanner;

public class CondicionalDoble {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digita un valor entero : "); 
		int a = sc.nextInt(); 
		boolean ok = true;
		boolean error=false;
		boolean error2 = false;
		boolean error3 = false;
		
		if (error) {
			System.out.println("Error 1");
		}else if (error2) {
			System.out.println("ERror 2");
		}else if (error3) {
			System.out.println("ERror 3");
		}else {
			System.out.println("Ok ");
		}
		
		if (ok) {
			System.out.println("Error OK 1");
		}else if (ok) {
			System.out.println("ERror OK 2");
		}else if (ok) {
			System.out.println("ERror OK 3");
		}else {
			System.out.println("Ok OK ");
		}
			
		
		if(a >= 0) { //bloque true 
			System.out.println("es un valor positivo"); 
		} else  { //bloque false
			System.out.println("es un valor negativo");
		}
		
			System.out.println("la variable a vale : " + a);
			sc.close();
	}
		
	
}
