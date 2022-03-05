package com.oct19;

public class VehiculoPrincipal {

	public static void main(String[] args) {
		Vehiculo[] misVehiculos =  new Vehiculo[4]; 
		Vehiculo carro1 = new Vehiculo("GH67", "Ferrari", "A89");
		Vehiculo carro2 =new VehiculoTuismo(4,"78JK", "Audi", "P14");
		
		misVehiculos[0] = carro1; 
		misVehiculos[1] = carro2; 
		misVehiculos[2] = new VehiculoDeportivo(500,"45GH", "Toyota", "KJ8"); 
		misVehiculos[3] = new VehiculoFurgoneta(2000, "JI8", "Toyota", "J9"); 
		
		for(Vehiculo vehiculos: misVehiculos) {
			System.out.println(vehiculos.mostrarDatos()); 
			System.out.println("");
		}
	}

}
