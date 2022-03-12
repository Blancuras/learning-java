package com.enero24Poo;

import com.sept8.Coche;

public class Carro {

	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int pesoPlataforma;
	private String color; 
	private int pesoTotal; 
	private boolean asientosCuero, climatizador; 

	public Carro() { // Constructor Encargado de darle un estado inicial
		setRuedas(4);
		largo = 2000;
		ancho = 300;
		motor = 1600;
		pesoPlataforma = 500;
	}

	public int getRuedas() {
		return ruedas;
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getMotor() {
		return motor;
	}

	public void setMotor(int motor) {
		this.motor = motor;
	}

	public int getPeso() {
		return pesoPlataforma;
	}

	public void setPeso(int peso) { //Metodo que lleva void void no lleva return, 
		this.pesoPlataforma = peso; // no devuelve valor 
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public int getPesoPlataforma() { //El que un metodo getter devuelva un valor, implica 
		return pesoPlataforma;			//que pongamos la instruccion return  
	}

	public void setPesoPlataforma(int pesoPlataforma) {
		this.pesoPlataforma = pesoPlataforma;
	}

	public String getColor() {
		return color;
	}

	public void estableceColor() { //setter
		color = "azul"; 
	}

	public int getPesoTotal() {
		return pesoTotal;
	}

	public void setPesoTotal(int pesoTotal) {
		this.pesoTotal = pesoTotal;
	}

	public boolean isAsientosCuero(String string) {
		return asientosCuero;
	}

	public void setAsientosCuero(boolean asientosCuero) {
		this.asientosCuero = asientosCuero;
	}

	public boolean isClimatizador() {
		return climatizador;
	}

	public void setClimatizador(boolean climatizador) {
		this.climatizador = climatizador;
	}

	public void estableceColor(String string) {
		
		
	}

//	Coche micoche=new Coche(); //creacion de instancia
//	micoche.estableceColor(JOptionPane.showInputDialog("Introduce color"));  //poner color en azul 
//	System.out.println(micoche.dimeDatosGenerales());
	
	
}
