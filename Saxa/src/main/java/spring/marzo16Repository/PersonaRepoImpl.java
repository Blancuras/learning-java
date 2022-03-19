package spring.marzo16Repository;

import java.util.logging.Logger;
 
import org.springframework.stereotype.Repository;

@Repository
public class PersonaRepoImpl implements IPersonaRepo{

	
	@Override
	public void registrar(String nombre) {
		System.out.println("Se registro a " + nombre); 

	}

}
