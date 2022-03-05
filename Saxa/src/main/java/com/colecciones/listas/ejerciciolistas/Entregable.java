package com.colecciones.listas.ejerciciolistas;

public interface Entregable {
	
	public void entregar(); 
	
	public void devolver(); 
	
	public boolean comprobarSiElArticuloEsEntregado(); 
	
	public int compareTo();

	int compareTo(Object objeto); 
	
}
