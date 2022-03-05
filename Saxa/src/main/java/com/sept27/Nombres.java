package com.sept27;
import java.util.Scanner;
public class Nombres {

	public static void main(String[] args) {
		String nombre1 = "", nombre2 = ""; 
		Scanner entrada = new Scanner(System.in); 
		
		System.out.print("Por favor ingresa tu primer nombre: ");
		nombre1 = entrada.nextLine(); 
		
		System.out.print("Por favor dame el segundo nombre:");
		nombre2 = entrada.nextLine(); 
		
		if(nombre1.trim().equalsIgnoreCase(nombre2.trim())) {  //equals Compara que sea exactamente igual
			System.out.println("Los nombres son iguales"); 
			} else {
				System.out.println("Los nombres son diferentes");
			}
		
	}

}
