package com.sept13;
import java.util.*;
public class UsoTallas {
//enum Talla {MINI, MEDIANO, GRANDE, MUYGRANDE} 
	
	public static void main(String[] args) {
	/*Talla s=Talla.MINI; 
	Talla m=Talla.MEDIANO; 
	Talla l=Talla.GRANDE; 
	Talla xl=Talla.MUYGRANDE; */ 
		
		Scanner entrada=new Scanner(System.in); 
		System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, MUY GRANDE");  
		String entradaDatos=entrada.next().toUpperCase();  
		TallasEnum laTalla=Enum.valueOf(TallasEnum.class, entradaDatos); 
		System.out.println("Talla=" + laTalla); 
		System.out.println("Abreviatura=" + laTalla.dameAbreviatura()); 
		
		
	}

}
