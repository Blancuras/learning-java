package com.oct4;

import java.util.Calendar;

import javax.swing.JOptionPane;

public class EntradaDatosPane {

	public static void main(String[] args) {
		String nombre; 
		int edad, nacimiento; 
		int anio= Calendar.getInstance().get(Calendar.YEAR);
		nombre = JOptionPane.showInputDialog("Ingresa tu nombre"); 
		nacimiento = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu fecha de nacimiento")); 
	
		
		edad = anio - nacimiento; 
		
		JOptionPane.showMessageDialog(null, "Hola, " + nombre + " el anio de nacimiento es: " + nacimiento + ", tu edad es: " + edad);
	}

}
