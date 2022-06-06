package com.polimorfismo11mayo;

public class LoginFacebook extends Login{

	@Override
	public boolean validarSesion() {
		System.out.println("Iniciando sesion con Faccebok " );
		return false;
	}

	
}
