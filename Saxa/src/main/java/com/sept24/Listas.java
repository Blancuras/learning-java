package com.sept24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		List<Integer> numeros = new LinkedList<>(); 
//		List<Integer> numeros = new ArrayList<>(); 
		numeros.add(50); 
		numeros.add(1); 
		numeros.add(20);  
		numeros.add(9); 
		Collections.sort(numeros);
//		numeros.add(0, 87);
		System.out.println(numeros.contains(5)); ;
		
		imprimirLista1(numeros); 
		imprimirLista2(numeros); 
	}
	
	private static void imprimirLista1(List<Integer> numeros) {
		for (Integer object : numeros) {
			System.out.println("imprimirLista1 " + object);
		}
	}
	
	private static void imprimirLista2(List<Integer> numeros) {
		for (int i = 0; i < numeros.size(); i++) {
			Integer array_element = numeros.get(i); 
			System.out.println("Imprimir lista 2 " + array_element);
			
		}
	}
}
