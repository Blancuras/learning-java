package com.sept13;

public enum TallasEnum{ //place holder
	MINI("S"), MEDIANO("M"), GRANDE("L"), MUYGRANDE("XL");
	
	private TallasEnum(String abreviatura) {
		this.abreviatura=abreviatura; 
	} 
	
	public String dameAbreviatura() {
		return abreviatura; 
	}
	private String abreviatura; 
}
