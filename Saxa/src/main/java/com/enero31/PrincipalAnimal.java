package com.enero31;

public class PrincipalAnimal {

	public static void main(String[] args) {
		Animal animal = new Animal(); 
		animal.comer();		
		animal.correr(); 
		
		Humano humano = new Humano(); 
		humano.setNombre("Humano1");
		
		Humano humano2 = new Humano("Humano 2"); 
		humano.correr(); 
		System.out.println(humano);
		System.out.println(humano2);
		
		Pajaro pajaro = new Pajaro(); 
		pajaro.vuela(); 
	}

}
