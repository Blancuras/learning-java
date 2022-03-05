package com.saxa.services;
/**
 gato -> cat
 perro -> dog
 pez -> fish
 casa -> house
 */
public class TranslateSpanishToEnglishService {

	//" dog ".trim() ->"dog" 
	public String translate(String word) {
		word = word.trim();
		
		if(word.equalsIgnoreCase("gato")) {
			return "cat";
		}else if(word.equalsIgnoreCase("perro")) {
			return "dog";
		}else if(word.equalsIgnoreCase("pez")) {
			return "fish";
		}else if(word.equalsIgnoreCase("casa")) {
			return "house";
		}
		return "No encontrado";
	}
	
}
