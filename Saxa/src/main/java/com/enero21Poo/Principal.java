package com.enero21Poo;

public class Principal {

	public static void main(String[] args) {
		Auto auto = new Auto();
		auto.setPatente( "ABC123"); 
		auto.setColor( "verde");
		auto.setKm(500);
		auto.setConAire(true); 
//		System.out.println(auto.getPatente() + " " + auto.getColor() + " " + auto.getKm() + " " + auto.isConAire());
		System.out.println(auto);
		
		Auto auto2 = new Auto();
		auto2.setPatente("DEF456");
		auto2.setColor("Azul");
		auto2.setKm(150);
//		System.out.println(auto2.getPatente() + " " + auto2.getColor() + " " + auto2.getKm() + " " + auto2.isConAire());
		System.out.println(auto2);
	}

}
