package spring.marzo19.estudiantes;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteService {
	
	@Autowired
	private EstudienteRepository repository; 

	public EstudianteEntity guardar(EstudianteEntity estudianteEntity) {
		estudianteEntity.setFechaNacimento(LocalDateTime.now());
		estudianteEntity = repository.save(estudianteEntity);
		return estudianteEntity;
	}

	public List<EstudianteEntity> getEstudiates() { //obtener
		return repository.findAll();
	}

	public EstudianteEntity actualizar(EstudianteEntity request) {
		EstudianteEntity nombreEntity = repository.findById(request.getId()).get(); //Buscamos por id en el repository
		
		nombreEntity.setNombre(request.getNombre());
		nombreEntity.setPassword(request.getPassword());
		nombreEntity.setPromedio(request.getPromedio());
		nombreEntity = repository.save(nombreEntity);
		return nombreEntity;
	} 
	
	public String borrar(Long id) {
		repository.deleteById(id);
		return "Se borro correctamente";
	}
}
