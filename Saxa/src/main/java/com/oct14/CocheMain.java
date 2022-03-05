package com.oct14;

public class CocheMain {

	public static void main(String[] args) {
		Coche coche1 = new Coche();
		coche1.setColor("blanco");
		coche1.setMarca("Audi");
		coche1.setKm(10);
		coche1.setNum(1);
		

		imprimirDettallesCoche(coche1);
		System.err.println("------");
		Coche coche2 = new Coche();
		coche2.setColor("rojo");
		coche2.setMarca("Ferrari");
		coche2.setKm(100); 
		coche2.setNum(2);
		imprimirDettallesCoche(coche2);
		System.err.println("-----------");
		
		
		Coche coche3 = new Coche();  
		coche3.setColor("Amarillo");
		coche3.setKm(200); 
		coche3.setMarca("Nissan");  
		coche3.setNum(3);
		imprimirDettallesCoche(coche3);
	}
	
	private static void imprimirDettallesCoche(Coche coche) {
		System.out.println("El color del coche "+coche.getNum()+" es: " + coche.getColor());
		System.out.println("La marca del coche  "+coche.getNum() + " es: "+ coche.getMarca());
		System.out.println("El kilometraje del coche  " +coche.getNum()+ " es: " + coche.getKm());
	}
}
