package com.polimorfismo;

public class ClasePrincipal {
	public static void main(String[] args) {
		
		OperacionesClasePadre mensajeroSuma = new SumaClaseHija();
		mensajeroSuma.pedirDatos();
		mensajeroSuma.operaciones();
		mensajeroSuma.mostrarResutado();
		
		OperacionesClasePadre mensajeroResta = new RestaClaseHija();
		mensajeroResta.pedirDatos();
		mensajeroResta.operaciones();
		mensajeroResta.mostrarResutado();
	}
}
