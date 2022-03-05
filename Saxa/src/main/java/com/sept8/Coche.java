package com.sept8;

public class Coche {

	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int pesoPlataforma;

	String color;
	int pesoTotal;
	boolean asientosCuero, climatizador;
				//METODO CONSTRUCTOR 
	//Establece un estado icicial para el objeto coche
	public Coche() {//inicializando valores desde el constructor
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		pesoPlataforma = 500;
	} 
	
	
	public String dimeDatosGenerales(){ //GETTER
		return "La plataforma del veiculo tiene " + ruedas + "ruedas" + 
				". Mide " + largo/1000 + " metros con un ancho de  " + ancho + 
				"cm y un peso de plataforma de " + pesoPlataforma + "kg"; 
	}

	public String dimeLargo() {
		return "El largo del coche es " + largo;
	}

	public void estableceColor(String colorCoche) {
		color=colorCoche; 
	}

	public String dimeColor() {
		return "El color del coche es " + color;
	}

	public void configuraAsientos(String asientosCuero){ //setter
	
		if(asientosCuero.equalsIgnoreCase("si")) {
			this.asientosCuero=true; 
		}else {
			this.asientosCuero=false; 
		}
	}
	
	public String dimeAsientos() { //getter
		if(asientosCuero) {
			return "El coche tiene asientos de cuero"; 
		}else{
			return "El coche tiene asientos de serie"; 
		}
	} 
	
	public void configuraClimatizador(String climatizador) { //setter
		if(climatizador .equalsIgnoreCase("si")) {
			this.climatizador=false;
		}
	}
	
	public String dimeClimatizador() { //getter
		if(climatizador) {
			return "El coche incorpora climatizador"; 
		}else{ 
			return "El coche lleva aire acondicionado"; 
			
		}
	} 
	
	public String dimePesoCoche() { //setter + getter
		int pesoCarroceria=500; 
		pesoTotal=pesoPlataforma+pesoCarroceria; 
		if(asientosCuero) {
			pesoTotal=pesoTotal+50;
		} 
		if(climatizador) {
			pesoTotal=pesoTotal+20; 
		} 
		return "El peso del coche es " + pesoTotal; 
	} 
	
	public int precioCoche() { //getter
		int precioFinal=10000; 
		if(asientosCuero) {
			precioFinal+=2000; 
		} 
		
		if(climatizador) {
			precioFinal+=1500; 
		}
		
		return precioFinal; 
		
	}
	
	
}
