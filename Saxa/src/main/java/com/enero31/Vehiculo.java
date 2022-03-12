package com.enero31;

//Esta es la clase padre abstracta

public class Vehiculo {
	protected String matricula;
	protected String marca;
	protected String modelo;

	
	public Vehiculo(String matricula, String marca, String modelo) {
		this.matricula = matricula;  //Estos parametros son recibidos dede las instancias
		this.marca = marca; 
		this.modelo = modelo;
	}
	
	//Validamos que la matricula sea real conectandonos a la base de datos de vehiculos
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
	//retornamos los datos del vehiculo
	public String mostrarDatos() {
		return "matricula = " + this.matricula + " marca " + this.marca 
				+ " modelo " + this.modelo;
	}
}
