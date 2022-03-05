package com.colecciones.conjuntos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestConjuntos {

	public static void main(String[] args) {
		Set<String> conjuntoHash = new HashSet<>(); // HashSet elimina los elmenos duplicados
		conjuntoHash.add("Mexico");
		conjuntoHash.add("Peru");
		conjuntoHash.add("Chile");
		conjuntoHash.add("Brasil");

		System.out.println("HashSet"); // no ordena elementos
		System.out.println("--------");
		for (String valor : conjuntoHash) {
			System.out.println("Valor : " + valor);
		}

		Set<String> conjuntoTree = new TreeSet<>();
		conjuntoTree.add("Mauricio");
		conjuntoTree.add("Eva");
		conjuntoTree.add("Rodrigo");
		System.out.println("");

		System.out.println("TreeSet"); // Ordena elementos y no muestra elementos duplicados
		System.out.println("-------");
		for (String valor : conjuntoTree) {
			System.out.println("Valor : " + valor);
		}

		System.out.println("");
		Set<Character> conjuntoLinked = new LinkedHashSet<>();
		conjuntoLinked.add('b');
		conjuntoLinked.add('z');
		conjuntoLinked.add('s');
		conjuntoLinked.add('p');
		conjuntoLinked.add('a');

		System.out.println("LinkedHashSet"); //imprime el orden en el que se añaden a la lista
		System.out.println("-------"); 		//No admite elementos duplicados
		for (Character valor : conjuntoLinked) {
			System.out.println("Valor : " + valor);
		}
	}
}
