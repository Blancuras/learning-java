package com.oct11;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/*
 * Pedir el dia, mes y anio de una fecha e indicar si la fecha es correcta. 
 * Suponiendo que todos los meses son de 30 dias. 
 */
import javax.swing.JOptionPane;

public class Condicionales {

	public static void main(String[] args) throws ParseException {
		int dia, mes, anio;

		dia = Integer.parseInt(JOptionPane.showInputDialog("Digita el dia"));
		mes = Integer.parseInt(JOptionPane.showInputDialog("Digita el mes"));
		anio = Integer.parseInt(JOptionPane.showInputDialog("Digita el anio"));

		if ((dia >= 1) && (dia <= 30)) { //si el dia es correcto
			if ((mes >= 1) && (mes <= 12)) { //si el mes es correcto
				if (anio != 0) { // si el anio es correcto
					JOptionPane.showMessageDialog(null, "Fecha correcta");
				} else {
					JOptionPane.showMessageDialog(null, "Fecha incorrecta, mes incorrecto");
				}
			} else {
				JOptionPane.showMessageDialog(null, "Fecha incorrecta, mes incorrecto");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Fecha es correcta, dia incorrecto");
		}
		
		SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        formatoFecha.setLenient(false);
		formatoFecha.parse("21/02/1999");
		
        System.out.println("Se termino de ejecutar el programa con exito");
        
	}
}
