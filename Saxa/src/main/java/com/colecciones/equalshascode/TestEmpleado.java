package com.colecciones.equalshascode;

public class TestEmpleado {

	public static void main(String[] args) {
		Empleado empleado1 = new Empleado("Sebastian", 28); 
		Empleado empleado3 = new Empleado("Sebastian", 28); 
		Empleado empleado2 = new Empleado("Carlos", 30); 
		
	/*	if(empleado1.equals(empleado2)) {
			System.out.println(" Los objetos son iguales ");
		} else {
			System.out.println(" Los objetos no son iguales");
		}*/
		
		if(empleado1.hashCode() == empleado2.hashCode()) {
			System.out.println("Los hash son iguales");
		} else {
			System.out.println("Los hash no son iguales");
		}
	}

}
