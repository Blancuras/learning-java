package com.rambo;

public class GuerraRambo {

	public static void main(String[] args) {
		//Crear instancia rambo1
		//NobreDeLaClase nombreInstancia = new NombreClase();
		Rambo rambo1 = new Rambo(); 
		//Disparar rambo1 
		rambo1.disparar();
		//Disparar rambo1 static
		Rambo.dispararStatic();
		
		//Crear instancia rambo2
		Rambo robocop = new Rambo(); 
		//Disparar rambo2 
		robocop.disparar();
		//Disparar rambo2 static 
		Rambo.dispararStatic();
		Rambo eliseo = new Rambo(); 
		eliseo.disparar();
		eliseo.disparar();
		eliseo.disparar();
		Rambo.dispararStatic(); 
		Rambo.dispararStatic();
		Rambo.dispararStatic();
		Rambo.dispararStatic();
		Rambo.dispararStatic();
		
		Rambo aileen = new Rambo(); 
		aileen.disparar(); 
		Rambo.dispararStatic();
	}

}
