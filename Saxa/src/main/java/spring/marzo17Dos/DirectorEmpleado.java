package spring.marzo17Dos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//SERVICE
@Service
public class DirectorEmpleado  implements Empleados{

	//Creacion de campo tipo CreacionINforme(INterfaz)

	private CreacionInformes informeNuevo;
	

	
	@Override
	public String getTareas() {
		return null;
	}

	@Override
	public String getInforme() {
		return "Informe creado por el Director: " + informeNuevo.getInforme();
	}
	
	
}
