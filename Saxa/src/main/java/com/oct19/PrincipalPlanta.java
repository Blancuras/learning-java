package com.oct19;

public class PrincipalPlanta {

	public static void main(String[] args) {
		Planta planta = new Planta();  
		AnimalCarnivoro animalCarnivoro = new AnimalCarnivoro(); 
		
		
		planta.alimentarse();
		animalCarnivoro.alimentarse();
	}

}
