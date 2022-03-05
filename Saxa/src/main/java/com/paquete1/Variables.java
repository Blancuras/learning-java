package com.paquete1;

public class Variables {

	public static void main(String[] args) { 
		//numericos 
			//enteros 
				byte b = 1; //-2^7 = -128 y 2^7-1 = -127
				short s = 1; //-2^15 = -32768 y 2^15-1 = 32767
				int i = 1; //-2^31 y 2^31-1
				long l = 1; //-2^63 y 2^63-1 
			//decimales 
				float f = 2.0f; //32 bits , 1 sign, 8 exponent, 23 mantissa  
				double d = 2.0; //64 bits, 1 sign, 16 exponent, 47 mantissa       
			//alfanumericos 
				char c = '1'; //UTF-8, ask, iso
			//booleanos  
				boolean bool = true; //true y false  
			//constantes 
				final int CONSTANTES1 = 3; 		
//				CONSTANTES1 = 4; // atributos que no pueden cambiar su valor 
	}

}
