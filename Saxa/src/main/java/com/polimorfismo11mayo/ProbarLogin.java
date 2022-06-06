package com.polimorfismo11mayo;

public class ProbarLogin {

	public static void main(String[] args) {
		Login facebook = new LoginFacebook();
		Login google = new LoginGoogle();

		probarLogin(facebook);
		probarLogin(google);
	}
	
	public static void probarLogin(Login login) {
		login.validarSesion();
	}
}
