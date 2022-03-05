package com.sept13;

public class UsoCarro {
	public static void main(String[] args) {
		
		Contador1.numero++; 
		Carro.dueno = "Eliseo";
		Carro bocho=new Carro(); 
		bocho.setAnio(2020);
		bocho.setModelo("bocho nuevo");
		System.out.println(bocho);
		
		Carro.dueno = "Aileen";
		Carro nissan=new Carro(1999);
		nissan.setModelo( "nissan"); 
		System.out.println(nissan);
		
		Carro batimovil=new Carro("batimovil", 1999); 
		System.out.println(batimovil);
		System.out.println(Contador1.numero);
	}
}
