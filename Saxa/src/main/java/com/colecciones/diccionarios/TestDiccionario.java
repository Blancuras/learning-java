package com.colecciones.diccionarios;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TestDiccionario {

	public static void main(String[] args) {
		Map<Integer, String> diccionarioHash = new HashMap<>();
		diccionarioHash.put(1, "Raul");
		diccionarioHash.put(2, "Ana");
		diccionarioHash.put(3, "Valeria");
		diccionarioHash.put(4, "Sebastian");
		diccionarioHash.put(5, "Manuel");

		for (Entry<Integer, String> entry : diccionarioHash.entrySet()) {
			System.out.println("Clave: " + entry.getKey() + " - " + " valor: " + entry.getValue());
		}

		System.out.println("");
		Map<String, Integer> diccionarioTree = new TreeMap<>();
		diccionarioTree.put("4", 50);
		diccionarioTree.put("1", 500);
		diccionarioTree.put("2", 10);
		diccionarioTree.put("3", 200);
		diccionarioTree.put("4", 50);
		diccionarioTree.put("5", 100);

		for (Entry<String, Integer> entry : diccionarioTree.entrySet()) {
			System.out.println("Clave: " + entry.getKey() + " - " + " valor: " + entry.getValue());
		}

		System.out.println("");
		Map<String, Integer> diccionarioLinked = new LinkedHashMap<>();
		diccionarioLinked.put("A", 50);
		diccionarioLinked.put("X", 500);
		diccionarioLinked.put("P", 10);
		diccionarioLinked.put("F", 200);
		diccionarioLinked.put("T", 50);
		diccionarioLinked.put("Q", 100);

		for (Entry<String, Integer> entry : diccionarioLinked.entrySet()) {
			System.out.println("Clave: " + entry.getKey() + " - " + " valor: " + entry.getValue());
		}
	}
}
