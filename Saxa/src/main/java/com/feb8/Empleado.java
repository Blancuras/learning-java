package com.feb8;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado {
	private String nombre;
	private double sueldo;
	private Date altaContrato;

	public Empleado(String nombre, double sueldo, int anio, int mes, int dia) {
		this.nombre = nombre;
		this.sueldo = sueldo;
		GregorianCalendar calendario = new GregorianCalendar(anio, mes - 1, dia);
		altaContrato = calendario.getTime();
	}

	public String dameNombre() { // Getter
		return nombre;
	} 
	
	public double dameSueldo() { //Getter
		return sueldo; 
	} 
	
	public Date dameFechaContrato() { //Getter
		return altaContrato; 
	} 
	
	public void subeSueldo(double porcentaje) {
		double aumento = sueldo * porcentaje / 100; 
		sueldo += aumento;
	}
}
