package com.saxa.Springdemo.abril2.nombres;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/11-abril")
public class NombreController {

	@Autowired
	private NombreService nombreService;

	@PutMapping("/guardar")
	public ResponseEntity<NombreEntity> guardar(@RequestBody NombreEntity nombreEntity) {
		System.out.println("Entrada " + nombreEntity);
		nombreEntity = nombreService.createNombre(nombreEntity);

		return new ResponseEntity<>(nombreEntity, HttpStatus.OK);
	}

	@GetMapping("/obtener")
	public ResponseEntity<List<NombreEntity>> obtenerNombres() {
		List<NombreEntity> nombres = nombreService.obtener();
		return new ResponseEntity<>(nombres, HttpStatus.OK);
	} 
	
	@PostMapping("/actualizar") 
	public ResponseEntity<NombreEntity> actualizarNombres(@RequestBody NombreEntity nombreEntity){
		System.out.println("actualizar" + nombreEntity); 
		nombreEntity = nombreService.actualizarNombre(nombreEntity); 
		return new ResponseEntity<>(nombreEntity, HttpStatus.OK);
		
	}
}
