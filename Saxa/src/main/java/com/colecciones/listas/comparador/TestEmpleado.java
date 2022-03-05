package com.colecciones.listas.comparador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmpleado  { 

	public static void main(String[] args) {

		List<Empleado> listaDeEmpleados = new ArrayList<>();
		listaDeEmpleados.add(new Empleado("Aileen", "Alvarado", "Mexico", 26, 900)); 
		listaDeEmpleados.add(new Empleado("Christian", "Ramirez", "Peru", 15, 500));
		listaDeEmpleados.add(new Empleado("Eliseo", "Larios", "Mexico", 29, 1600));
		listaDeEmpleados.add(new Empleado("Andrea", "Gutierrez", "Mexico", 26, 1100)); 
		
	//	Collections.sort(listaDeEmpleados); 

		for(Empleado empleado : listaDeEmpleados) {
			System.out.println(""); 
			System.out.println("Nombre : " + empleado.getNombre()); 
			System.out.println("Apellido : " + empleado.getApellido()); 
			System.out.println("Edad : " + empleado.getEdad()); 
			System.out.println("Pais : " + empleado.getPais());  
			System.out.println("Sueldo " + empleado.getSueldo());  
			
			
			
		}
	}
}
