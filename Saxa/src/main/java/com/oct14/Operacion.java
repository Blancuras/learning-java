package com.oct14;

//import javax.swing.JOptionPane;

public class Operacion {
	// Atributos
	int numero1, numero2, suma, resta, multiplicacion,division; 
	//Metodos 

	//se ejecuta cuando se crea una instancia
	public Operacion() { //Constructor
		System.out.println("SE ejecuto el constructor");
		//numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
		//numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
	 }
	
	// Metodo para sumar ambos numeros
	public int sumar(int numero1, int numero2) {
		int suma = numero1 + numero2; 
		return suma; 
	}

	// Metodo para restar ambos numeros
	public int restar(int numero1, int numero2) {
		int resta = numero1 - numero2; 
		return resta; 
	}

	

	//Metodo para multiplicar ambos numeros
	public int multiplicar(int numero1, int numero2) {
		int multiplicar = numero1 * numero2;
		return multiplicar; 
	}



	//Metodo para Dividir ambos numeros
	public int  dividir(int numero1, int numero2) {
		int division = numero1 / numero2; 
		return division; 
	} 
	
	
}
