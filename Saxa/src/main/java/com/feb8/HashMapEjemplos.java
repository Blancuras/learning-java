package com.feb8;

import java.util.HashMap;
import java.util.Map;

import com.feb4.VehiculoModerno;

public class HashMapEjemplos {

	public static void main(String[] args) {
		Map<Integer, String> numeros = new HashMap<>();
		numeros.put(1, "uno");
		numeros.put(2, "dos");
		numeros.put(34, "tres dfkjdhkj");
		
		System.out.println(numeros.get(34));
		
		//Ejemplo2
		Map<String, VehiculoModerno> carros =obtenerTodosLosCarrosDisponibles();
		
		System.out.println(carros.get("chevi"));
		
	}
	
	private static Map<String, VehiculoModerno> obtenerTodosLosCarrosDisponibles(){
		Map<String, VehiculoModerno> carros = new HashMap<>();
		VehiculoModerno bocho = new VehiculoModerno("Matricula", "Vocho", "2010");
		VehiculoModerno tsuru = new VehiculoModerno("Matricula2", "Tsuru", "2015");
		VehiculoModerno chevi = new VehiculoModerno("Matricula3", "Chevi", "2014");
		carros.put("bochoman", bocho);
		carros.put("tsuru", tsuru);
		carros.put("chevi", chevi);
		return carros;
	}
}
