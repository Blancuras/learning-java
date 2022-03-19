package spring.marzo14.nombres;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NombresService {

	
	@Autowired //Creamos instancia de repository
	private NombresRepository repository;
	@Autowired
	private ChuchitaService chuchitaService;
	
	public Long save(String nombre) {
		NombreEntity nombreEntity = new NombreEntity();
		nombreEntity.setNombre(nombre);
		nombreEntity= repository.save(nombreEntity);
		return nombreEntity.getId();
	}
	public List<NombreEntity> getNombres(){
		chuchitaService.horaChuchita();
		return repository.findAll();
	} 
	
	public Long actualizar(NombreDTO nombreDTO) {
		NombreEntity nombreEntity = repository.findById(nombreDTO.getId()).get();
		nombreEntity.setNombre(nombreDTO.getNombreChamaco());
		repository.save(nombreEntity);
		return nombreEntity.getId();
	}
}
