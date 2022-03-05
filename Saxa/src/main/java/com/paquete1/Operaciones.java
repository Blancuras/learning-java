package com.paquete1;

public class Operaciones {
	public static void main(String[] args) {
		//operaciones aritmeticas 
		//suma y resta 
		int var1 = 2, var2 = 3, var5 = 126; 
		double var4 = 3.0, varNula = 0.0; 
		
		int resSuma = var1 + var2; 
		System.out.println("El resultado de la suma es " +resSuma);
		
		int resResta = var1 -var2; 
		System.out.println("El resultado de la resta es " + resResta);
		
		//multiplicacion  
		int resMult = var1 * var2; 
		System.out.println("El resultado de la multiplicacion es " +resMult);
		
		//division entera y modulo de la division 
		int restInt = var2/ var1;  
		System.out.println("El resultado de la division es " + restInt);
	
 		int mod = var2 % var1; 
		System.out.println("El resultado del modulo es " + mod); 
		
		//division 
		double resDiv = var4 / var1; 
		double divNula = var4 / varNula; 
		System.out.println(divNula); 
		
		
		//suma caracteres 
			//operaciones booleanas 
			//comparacion 
		boolean resMayor = var2 > var1; 
		boolean resMenor = var2 < var1; 
		boolean resIgual = var2 ==var1; 
		boolean resDiferentes = var2 != var1; 
		
			//operaciones de conjuncion logica
		boolean b1 = true, b2 = false; 
		boolean resAnd = b1 && b2; //Tienen que ser los 2 true delocontrario sera false
		boolean resOr = b1  || b2; // cualquiera que sea true OK
		boolean resNot = !b1;       //negacion
	

	} 
}
	