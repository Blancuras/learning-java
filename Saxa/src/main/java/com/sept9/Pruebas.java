package com.sept9;

public class Pruebas {

	public static void main(String[] args) {
		Empleados trabajador1=new Empleados("Paco"); 
		Empleados trabajador2=new Empleados("Ana");  
		Empleados trabajador3=new Empleados("Antonio"); 
		Empleados trabajador4=new Empleados("Maria"); 
		trabajador1.cambiaSeccion("Recursos Humanos"); 
		
		System.out.println(trabajador1.devuelveDatos() + "\n" + trabajador2.devuelveDatos() +  
				"\n" + trabajador3.devuelveDatos() + "\n" + trabajador4.devuelveDatos()); 
		
		System.out.println(Empleados.dameIdSiguiente());
	}

}


class Empleados{
	
	private String nombre; 
	private String seccion; 
	private static int id; 
	private static int idSiguiente=1; 
	
	public Empleados(String nom) { //Constructor
		nombre=nom; 
		seccion="Administracion";  
		id=idSiguiente; 
		idSiguiente++; 
	} 
	
	public void cambiaSeccion(String seccion) { //setter
		this.seccion=seccion; 
	}  
	
	public void cambiaNombre(String nombre) {
		this.nombre=nombre; 
	}
	
	public String devuelveDatos() {
		return"El nombre es: " + nombre + " y la seccion es "  + seccion + " y el Id=" + id; 
	} 
	
	public static String dameIdSiguiente() {
		return "El Id Siguiente es: "  + idSiguiente; 
	}
	
}