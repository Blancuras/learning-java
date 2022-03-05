package com.sept9;

import java.util.*;

public class UsoEmpleado {

	public static void main(String[] args) { 
		
		/*Empleado empleado1=new Empleado("Paco Gomez", 85000, 1990, 12, 17); 
		Empleado empleado2=new Empleado("Ana Lopez", 95000, 1995, 06, 02); 
		Empleado empleado3=new Empleado("Maria Martin", 105000, 2002, 03, 15);  
		
		empleado1.subeSueldo(5); 
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5); 
		
		System.out.println("Nombre: " + empleado1.dameNombre() + " Sueldo: " + empleado1.dameSueldo()
				+" Fecha de Alta: " + empleado1.dameFechaContrato()); 
		
		System.out.println("Nombre: " + empleado2.dameNombre() + " Sueldo: " + empleado2.dameSueldo()
		+" Fecha de Alta: " + empleado2.dameFechaContrato());

		System.out.println("Nombre: " + empleado3.dameNombre() + " Sueldo: " + empleado3.dameSueldo()
		+" Fecha de Alta: " + empleado3.dameFechaContrato());*/
		
		Empleado[] misEmpleados=new Empleado[4]; 
		misEmpleados[0]=new Empleado("Paco Gomez", 85000, 1990, 12, 17); 
		misEmpleados[1]=new Empleado("Ana Lopez", 95000, 1995, 06, 02); 
		misEmpleados[2]=new Empleado("Maria Martin", 105000, 2002, 03, 15); 
		misEmpleados[3]=new Empleado("Eliseo", 47500, 2009, 11, 9);
		Empleado empleadoEliseo =new Empleado("Eliseo2");
		/*for(int i=0;i<3; i++){
			
			misEmpleados[i].subeSueldo(5);
		}*/ 
		
		for(Empleado empleado: misEmpleados) { //for each
			empleado.subeSueldo(5);
		}
		
		/*for(int i=0; i<3;i++) {
			System.out.println("Nombre: " + misEmpleados[i].dameNombre()
					+ "Sueldo: " + misEmpleados[i].dameSueldo()
					+ "Fecha de Alta: " + misEmpleados[i].dameFechaContrato()); 
		}*/ 
		for(Empleado empleado: misEmpleados) {
			System.out.println("Nombre: " + empleado. dameNombre()
					+ "Sueldo: " + empleado.dameSueldo()
					+ "Fecha de Alta: " + empleado.dameFechaContrato()); 
		}
		
	}

}

class Empleado {
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	
	public Empleado(String nom, double sueldo, int anio, int mes, int dia) { //constructor1
		nombre = nom;
		this.sueldo = sueldo;
		GregorianCalendar calendario = new GregorianCalendar(anio, mes - 1, dia);
		altaContrato = calendario.getTime(); // devuelve la fecha
	} 

//	public Empleado() {
//		
//	}
	
	public Empleado(String nombre) {  //Constructor 2
		this.nombre=nombre; 
	}
	
	public String dameNombre() { // getter
		return nombre;
	}

	public double dameSueldo() { // getter
		return sueldo;
	}

	public Date dameFechaContrato() {
		return altaContrato;
	}

	public void subeSueldo(double porcentaje) {    //setter
		double aumento=sueldo*porcentaje/100; 
		sueldo+=aumento; 
	} 
	

}
