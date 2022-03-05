package com.colecciones.listas.comparable;

import java.util.Comparator;

public class ComparatorEmpleado implements Comparator<Empleado>{
	
	@Override
	public int compare(Empleado primerEmpleado, Empleado segundoEmpleado) {  
		//Usamos esto cuando ordenamos datos de tipo String 
		//return primerEmpleado.getNombre().compareTo(segundoEmpleado.getNombre());  
		
		int respuesta = 0; 
		if(primerEmpleado.getEdad() > segundoEmpleado.getEdad()) {
			respuesta = 1; //positivo
		} else if(primerEmpleado.getEdad()< segundoEmpleado.getEdad()) {
			respuesta = -1; //negativo
		} else {
			respuesta = 0; 
		} return respuesta; 
		
	} 
}
