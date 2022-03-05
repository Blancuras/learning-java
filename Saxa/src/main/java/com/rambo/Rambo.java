package com.rambo;

public class Rambo {
	private int disparos = 0; 
	private static int disparosStatic = 0;
	
	public void disparar() {
		disparos +=1; 
		System.out.println("disparados " + disparos);
	}
	
	public static void dispararStatic() {
		disparosStatic +=1; 
		System.out.println("disparados static " + disparosStatic);
	}
}