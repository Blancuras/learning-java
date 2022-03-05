package com.oct15;

public class PeersonaMain {

	public static void main(String[] args) {
		Peersona molly = new Peersona("Molly", 5);
		
		Peersona blancuras = new Peersona();
		blancuras.setEdad(1);
		blancuras.setNombre("blancuras");
			
		molly.mostrarDatos();
		blancuras.mostrarDatos();
	}
}
