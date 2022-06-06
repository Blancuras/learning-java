package com.polimorfismo11mayo;

public class LoginGoogle extends Login{

	@Override
	public boolean validarSesion() { 
		System.out.println("Iniciando sesion en Google" );
		return false;
	}

}
