package com.enero31;

public class PrincipalEstatica {

	public static void main(String[] args) {
		Estatica instancia1 = new Estatica(); 
		Estatica instancia2 = new Estatica(); 
		
		System.out.println("instancia1 estatic " + instancia1.estatic); 
		System.out.println("instancia1 normal" + instancia1.normal); 
		
		System.out.println("instancia2 estatic " + instancia2.estatic); 
		System.out.println("instancia2 normal" + instancia2.normal); 
		
		
		
		/*System.out.println("instancia1" + instancia1.normal); 
		System.out.println("instancia2" + instancia1.normal);
		instancia1.normal = "Cambio de valor en instancia 1";  
		instancia2.normal = "Cambio de valor en instancia 2"; 
		
		System.out.println("instancia1 =" + instancia1.normal);
		System.out.println("instancia2 =" + instancia2.normal);*/
		
	}

}
