package com.feb23;

public class Cliente {
	
	private String nombre; 
	private String apellido; 
	private String ine; 
	private Cuenta cuentas[];
	
	public Cliente(String nombre, String apellido, String ine, Cuenta[] cuentas) { //constructor
		this.nombre = nombre;
		this.apellido = apellido;
		this.ine = ine;
		this.cuentas = cuentas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getIne() {
		return ine;
	}

	public void setIne(String ine) {
		this.ine = ine;
	}

	public Cuenta[] getCuentas() {
		return cuentas;
	}

	public void setCuentas(Cuenta[] cuentas) {
		this.cuentas = cuentas;
	} 
	
	//Retorno el saldo de la cuenta
	public double consultarSaldo(int indice) {
		return cuentas[indice].getSaldo();
	}
	
	//Creamos el metodo para ingresar dinero
	public void ingresarDinero(int indice, double cantidad) {
		cuentas[indice].depositarDinero(cantidad);
	} 
	
	//Creamos el metodo para retirar dinero 
	public void retirarDinero(int indice, double cantidad) {
		cuentas[indice].retirarDinero(cantidad);
	}
}
