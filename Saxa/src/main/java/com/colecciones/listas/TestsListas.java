package com.colecciones.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestsListas {
	
	public static void main(String[] args) {
		List<Integer> listaDeNumeros = new ArrayList<>(); 
		listaDeNumeros.add(100); 
		listaDeNumeros.add(93); 
		listaDeNumeros.add(9183); 
		listaDeNumeros.add(900); 
		listaDeNumeros.add(1);
		
		//Eliminamos un elemento y le paso de posicion
		//listaDeNumeros.remove(1); 
		
		//Elimino todos los elementos de la lista  
		//listaDeNumeros.clear(); 
		
		//Ordenamos los elementos 
		//Collections.sort(listaDeNumeros); 
		
		//Invertimos la lista
		Collections.reverse(listaDeNumeros);
		
		for(Integer valor : listaDeNumeros) {
			System.out.println(valor);
		} 
		
		
		System.out.println("\nEl tamaño de la lista es: " + listaDeNumeros.size());
		System.out.println("Obtengo un elemento: " + listaDeNumeros.get(3));  
		System.out.println("Obtenemos las pocision de un elemento " + listaDeNumeros.indexOf(1));
		System.out.println("La lista esta vacia " +  listaDeNumeros.isEmpty()); 
		System.out.println("El mayor elemento es: " + Collections.max(listaDeNumeros));
		System.out.println("El menor elemento es " + Collections.min(listaDeNumeros)); 
		
	}
}
