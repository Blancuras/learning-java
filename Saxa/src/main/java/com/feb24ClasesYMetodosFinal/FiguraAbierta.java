package com.feb24ClasesYMetodosFinal;

public class FiguraAbierta extends Figura{

	public FiguraAbierta(double tamano) {
		super(tamano);
	} 
	
	@Override
	public void dibujar() {
		System.out.println("Dibujando figura abierta de tamano " + tamano);
	} 
	
	@Override
	public void pintar() {
		System.out.println("Pintando figura abierta de tamano " + tamano);
	}

}
