package com.oct13;

import javax.swing.JOptionPane;

public class BusquedaSecuencial {

	public static void main(String[] args) {
		int arreglo[] = {4, 1, 5, 2, 3};
		boolean bandera = false; 
		
		int dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero a buscar")); 
		//dato = 5; 
		//Busqueda Secuencial 
		int indice = 0; 
		while(indice <5 && !bandera){
			if(arreglo[indice] == dato) {
				bandera = true; 
			} 
			indice++; 
		} 
		
		if( bandera ) {
			JOptionPane.showMessageDialog(null,"El numero ha sido encontrado en la posicion: " + (indice - 1));
		} else {
			JOptionPane.showMessageDialog(null, "El numero no se encuentra en el arreglo");
		}
	}

}
