package com.oct19;

public class Planta extends SerVivo{
	
	@Override
	public void alimentarse() {
		super.cola();
		System.out.println("La planta se alimenta a traves de la fotosintesis");
	}

}
