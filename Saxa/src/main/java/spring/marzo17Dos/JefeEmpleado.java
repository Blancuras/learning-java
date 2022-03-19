package spring.marzo17Dos;

public class JefeEmpleado implements Empleados{
	
	public String getTareas() {
		return "Gestiono las cuestiones relativas a mis empleados de seccion"; 
	}

	@Override
	public String getInforme() {
		return null;
	}
}
