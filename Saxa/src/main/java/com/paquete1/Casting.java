package com.paquete1;

public class Casting {

	public static void main(String[] args) {
	//cast implicito 
		//declaro e inicializo una variable de tipo int y una de tipo float 
		int varInt = 50; 
		float varfloat = 100f; 
		
		//de tipo int a long 
		long varLong = varInt; 
		
		//de tipo int a double
		double varDouble = varInt;
		
		//de tipo float a double 
		 varDouble = varfloat; 
		 
		 // errores 
		 // varInt = varLong; 
		 // varfloat = varDouble; 
	 
		 
	//casting explicito	  
		 varLong = 50; 
		 
		 //de long a byte 
		byte varByte = (byte) varLong; 
}
}
