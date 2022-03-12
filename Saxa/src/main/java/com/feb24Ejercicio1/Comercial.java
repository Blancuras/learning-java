package com.feb24Ejercicio1;

public class Comercial extends Empleado {

	private double comision;

	public Comercial(double comision, String nombre, int edad, double salario) {
		super(nombre, edad, salario);
		this.comision = comision;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	@Override
	public String toString() { 
		System.out.println(super.toString());
		return "Comision: " + comision;
	}

	@Override
	public boolean aumento() {
		// Si tiene mas de 30 años y cobra una comision de mas de $200
		if (super.getEdad() > 30 && this.comision > 200) { // super hace referencia a la super clase
			double nuevoSalario = super.getSalario() + super.AUMENTO;
			super.setSalario(nuevoSalario);
			System.out.println("\nSe le ha añadido el aumento al empleado " + super.getNombre());
			System.out.println("Su salario actual es: " + nuevoSalario);
			return true;
		} else {
			System.out.println("\nEl empleado no cumple con los requisitos para el aumento");
			return false;
		}
	}

}
