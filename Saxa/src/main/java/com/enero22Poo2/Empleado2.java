package com.enero22Poo2;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado2 extends Persona {

	private static int idSiguiente;
	private double sueldo;
	private Date altaContrato;

	public Empleado2(String nom, double sueldo, int anio, int mes, int dia) { // Constructor
		super(nom); 
		this.sueldo = sueldo;
		this.altaContrato = new GregorianCalendar(anio, mes - 1, dia).getTime();
	} 
	
	public String dameDescripcion() { //sobreescribimos el metodo
		return "Este empleado tiene un Id = " + idSiguiente + " con un sueldo = " + sueldo; 
	}

	public double dameSueldo() { // getter
		return sueldo;
	}

	public Date dameFechaContrato() { // getter
		return altaContrato;
	}

	public void subeSueldo(double porcentaje) { // setter
		double aumento = sueldo * porcentaje / 100;
		sueldo += aumento;
	} 
	 
}
