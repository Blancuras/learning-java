package com.feb24Ejercicio1;

public class Repartidor extends Empleado {

	private String zona;

	public Repartidor(String zona, String nombre, int edad, double salario) {
		super(nombre, edad, salario);
		this.zona = zona;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	@Override
	public String toString() { 
		System.out.println(super.toString());
		return "Zona: " + zona;
	}

	@Override
	public boolean aumento() {
		// Si tiene menos de 25 años y reparte en "Sayula"
		if (super.getEdad() < 25 && this.zona.equalsIgnoreCase("Sayula")) {
			double nuevoSalario = super.getSalario() + super.AUMENTO;
			super.setSalario(nuevoSalario);
			System.out.println("\nSe ha añadido el aumento al empleado " + super.getNombre());
			System.out.println("Su salario actual es: " + nuevoSalario);
			return true;
		} else {
			System.out.println("El empleado no cumple con los requisitos para el aumento");
			return false;
		}
	}
}
