package com.curso3;
import javax.swing.*;
public class AccesoAolicacion {

	public static void main(String[] args) {
		
		String clave="Linda"; 
		String pass=""; 
		
		while ( !clave.equalsIgnoreCase(pass) ) {  //equals se utiliza para comparar cadenas de texto
			
			pass=JOptionPane.showInputDialog("Introduce la contrasena"); 
			
			if ( !clave.equalsIgnoreCase(pass) ) {//clave.equals(pass)==false   !clave.equals(pass)
				
				System.out.println("Contrasena incorrecta");
			}
		} 
		System.out.println("Contrasena Correcta. Acceso permitido");
	}

}
