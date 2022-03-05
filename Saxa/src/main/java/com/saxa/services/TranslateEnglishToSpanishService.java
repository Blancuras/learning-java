package com.saxa.services;
/**
 cat -> gato
 dog -> perro
 fish -> pez
 house -> casa
 */
public class TranslateEnglishToSpanishService {

	//" dog ".trim() ->"dog" 
	public String translate(String word) {
		word = word.trim();
		
		if(word.equalsIgnoreCase("cat")) {
			return "gato";
		}else if(word.equalsIgnoreCase("dog")) {
			return "perro";
		}else if(word.equalsIgnoreCase("fish")) {
			return "pez";
		}else if(word.equalsIgnoreCase("house")) {
			return "casa";
		}
		return "Not found";
	}
	
}
