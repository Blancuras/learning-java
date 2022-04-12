package com.saxa.Springdemo.abril2.nombres;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
			throw new RuntimeException("El id es requerido");
		}
		NombreEntity busqueda = nombreRepository.findById(nombreEntity.getId())
				.orElseThrow(() -> new RuntimeException("Id no encontrado"));
		
		busqueda.setNombre(nombreEntity.getNombre());
		return nombreRepository.save(busqueda);
	}
}
