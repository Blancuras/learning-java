package com.oct19;

import java.time.LocalDate;

public class PerroAnimal extends Animal {
	
	@Override //SobreEscritura
	public void comer() {
		System.out.println("Estoy comiendo con mi platito en el suelo "+LocalDate.now());
	}
	
	public static void main(String[] args) {
		PerroAnimal perro = new PerroAnimal();
		perro.comer();
	}
}
