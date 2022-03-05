package com.sept27;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		String usuario = "", password = "";
		Scanner entrada = new Scanner(System.in);

		System.out.print("Ingresa tu nombre de ususario ");
		usuario = entrada.nextLine();

		System.out.print("Ingresa tu contraseña ");
		password = entrada.nextLine();

		if (usuario.trim()
				.equalsIgnoreCase("molly") 
				&& password.trim().
				equalsIgnoreCase("123456")) {
			System.out.println("Inicio de sesion correcto");
		} else {
			System.out.println("Nombre de usuario o contraseña incorrectos");
		}
	}

}
