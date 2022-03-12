package com.enero22Poo2;

public class Pruebas {

	public static void main(String[] args) {
		Empleados trabajador1 = new Empleados("Paco"); // pasamos como parametro el id
		Empleados trabajador2 = new Empleados("Ana");
		Empleados trabajador3 = new Empleados("Antonio");
		Empleados trabajador4 = new Empleados("Maria");

		System.out.println(trabajador1.devuelveDatos() + "\n" + trabajador2.devuelveDatos() + "\n"
				+ trabajador3.devuelveDatos() + "\n" + trabajador4.devuelveDatos());
		System.out.println(Empleados.dameIdSiguiente());
	}

}

