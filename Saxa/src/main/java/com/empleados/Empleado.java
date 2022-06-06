package com.empleados;

public class Empleado extends Trabajador {
	private double sueldo;
	private double impuestos;

	public Empleado(String nombre, double sueldo) {
		super(nombre);
		this.sueldo = sueldo;
		this.impuestos = 0.483 * sueldo;
	}

	public double calcularPaga() {
		return (sueldo - impuestos);
	}

	public String toString() {
		return "Empleado: " + super.toString();
	}
}
