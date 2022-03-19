package spring.marzo17Dos;

public class UsoEmpleados {

	public static void main(String[] args) {
		
		//Creacion de objetos de tipo Empleado 
		Empleados empleado1 = new SecretarioEmpleado(); 
		
		
		//Uso de los objetos creados 
		System.out.println(empleado1.getTareas());
		System.out.println(empleado1.getInforme());
	}

}
