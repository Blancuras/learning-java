package com.marzo;

public class PasoPorReferencia {

	public static void main(String[] args) {
		Caja caja = new Caja(10,10,10);
		System.out.println(caja);
		
		modificarCaja(caja);
		System.out.println("caja2 "+caja);
	}
	
	
	private static void modificarCaja(Caja caja) {
//		caja = new Caja();
		caja.setAlto(666);
	}
}
