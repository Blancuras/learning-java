package com.feb4;

public class PrincipalVehiculo {

	public static void main(String[] args) {
		VehiculoModerno misVehiculos[] = new VehiculoModerno[4]; 
		
		misVehiculos[0] = new VehiculoModerno("GHG7", "Ford", "1993"); 
		misVehiculos[1] = new VehiculoTurismo(4, "78HJ", "Audi", "P14"); 
		misVehiculos[2] = new VehiculoDeportivo(500, "45HG", "Toyota", "KJ8"); 
		misVehiculos[3] = new VehiculoFurgoneta(2000, "JI8", "Toyota", "J9"); 
		
		for(VehiculoModerno vehiculos: misVehiculos) {
			System.out.println(vehiculos.mostrarDatos()); 
			System.out.println(""); 
		}
	}

}
