package com.marzo;

public class PalabraReturnClases {
	public static void main(String[] args) {
		Suma suma = creaObjetoSuma(); 
		System.out.println("resultado de llamar el metodo sumar: " + suma.sumar());
	} 
	
	private static Suma creaObjetoSuma(){
		Suma sum = new Suma(4,6);
		return sum;
	}
}

class Suma {
	int a; 
	int b;
	
	public Suma(int a, int b) {
		this.a = a; 
		this.b = b; 
	}   
	
	public int sumar() {
		return a + b; 
	}
	
	
}