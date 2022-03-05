package com.saxa.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.saxa.services.TranslateEnglishToSpanishService;
import com.saxa.services.TranslateSpanishToEnglishService;

@RestController
public class TranslatorController {

	@GetMapping("/english-spanish/{englishWord1}")
	public String translate(@PathVariable String englishWord1) {
		TranslateEnglishToSpanishService traductor = new TranslateEnglishToSpanishService();
		String traducida = traductor.translate(englishWord1); 
		return traducida; 
	}
	
	@GetMapping("/spanish-english/{spanishWord}")
	public String translate2(@PathVariable String spanishWord) {
		TranslateSpanishToEnglishService traductor = new TranslateSpanishToEnglishService();
		String traducida = traductor.translate(spanishWord); 
		return traducida; 
	}
	
	
	
}
