package com.saxa.Springdemo.abril2.nombres;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saxa.Springdemo.errores.GenericError;

@Service
public class NombreService {

	@Autowired
	private NombreRepository nombreRepository;

	public NombreEntity createNombre(NombreEntity nombreEntity) {
		return nombreRepository.save(nombreEntity);
	}

	public List<NombreEntity> obtener() {
		return nombreRepository.findAll();
	}

	public NombreEntity actualizarNombre(NombreEntity nombreEntity) {
		if (nombreEntity.getId() == null) {
			throw new GenericError("El id es requerido");
		}
		NombreEntity busqueda = nombreRepository.findById(nombreEntity.getId())
				.orElseThrow(() -> new GenericError("Id no encontrado"));
		
		busqueda.setNombre(nombreEntity.getNombre());
		
		return nombreRepository.save(busqueda); 
		
	} 
	public String borrarNombre(NombreEntity nombreEntity) {
		//verificar que exista
		nombreRepository.findById(nombreEntity.getId())
				.orElseThrow(() -> new GenericError("Id no encontrado"));
		
		nombreRepository.delete(nombreEntity);
		return "Se borro correctamente"; 
	}

}

