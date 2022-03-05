package com.sept8; 
//import javax.swing.*;

public class UsoVehiculo {

	public static void main(String[] args) {
		
		/*Coche micoche=new Coche(); //creacion de instancia
		micoche.estableceColor(JOptionPane.showInputDialog("Introduce color"));  //poner color en azul 
		System.out.println(micoche.dimeDatosGenerales());
		
		System.out.println(micoche.dimeColor()); 
		
		micoche.configuraAsientos(JOptionPane.showInputDialog("Tiene asientos de cuero?")); 
		System.out.println(micoche.dimeAsientos());
		
		micoche.configuraClimatizador(JOptionPane.showInputDialog("Tiene climatizador?")); 
		
		System.out.println(micoche.dimeClimatizador());
		
		System.out.println(micoche.dimePesoCoche()); 
		
		System.out.println("El precio final del coche es: " + micoche.precioCoche());*/ 
		
		
		Coche micoche1=new Coche(); 
		micoche1.estableceColor("Rojo"); 
		Furgoneta miFurgoneta1=new Furgoneta(7, 580); 
		miFurgoneta1.estableceColor("azul"); 
		miFurgoneta1.configuraAsientos("Si"); 
		miFurgoneta1.configuraClimatizador("si");   
		
		System.out.println(micoche1.dimeDatosGenerales() + " " + micoche1.dimeColor()); 
		
		System.out.println(miFurgoneta1.dimeDatosGenerales() + miFurgoneta1.dimeDatosFurgoneta());
		
	}

}
