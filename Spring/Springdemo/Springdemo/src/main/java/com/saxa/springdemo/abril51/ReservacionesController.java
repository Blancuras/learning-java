package com.saxa.springdemo.abril51;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/15-abril")
public class ReservacionesController {

	@Autowired
	private ReservacionesService reservacionesService;

	@PostMapping("/crear")
	public ResponseEntity<ReservacionesEntity> crear(@RequestBody 
			ReservacionesEntity reservacionesEntity) {
		reservacionesEntity = reservacionesService.crear(reservacionesEntity);
		return new ResponseEntity<>(reservacionesEntity,  HttpStatus.CREATED); 
	} 
	
	@PutMapping("/actualizar")
	public ResponseEntity<ReservacionesEntity> actualizar(@RequestBody
			ReservacionesEntity reservacionesEntity){
		reservacionesEntity = reservacionesService.actualizar(reservacionesEntity); 
	return new ResponseEntity<>(reservacionesEntity, HttpStatus.OK); 	
	}
	
	@GetMapping("/obtener")
	public ResponseEntity< List<ReservacionesEntity> > obtener(){
		 List<ReservacionesEntity> resultado = reservacionesService.obtener();
		 return new ResponseEntity<>(resultado, HttpStatus.OK);
	} 
	
	@DeleteMapping("/borrar")
	public ResponseEntity<String> borrar (@RequestBody ReservacionesEntity reservacionesEntity){
		String eliminar = reservacionesService.borrar(reservacionesEntity); 
		return new ResponseEntity<>(eliminar, HttpStatus.OK);
	}

}
