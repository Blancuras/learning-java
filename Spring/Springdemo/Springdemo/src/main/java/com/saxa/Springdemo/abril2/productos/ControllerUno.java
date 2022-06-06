package com.saxa.springdemo.abril2.productos;

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

import com.saxa.springdemo.abril2.nombres.NombreEntity;

@RestController
@RequestMapping(value = "/2-abril")
public class ControllerUno {

	@Autowired
	private ServiceUno serviceUno;

	@PutMapping("/saludo1")
	public ResponseEntity<String> holaPut() {
		String hola = serviceUno.generarSaludo("put");
		return new ResponseEntity<>(hola, HttpStatus.OK);
	}

	@PostMapping("/saludo1")
	public ResponseEntity<String> holaPost() {
		String hola = serviceUno.generarSaludo("post");
		return new ResponseEntity<>(hola, HttpStatus.OK);
	}

	@DeleteMapping("/saludo1")
	public ResponseEntity<String> holaDelete() {
		String hola = serviceUno.generarSaludo("delete");
		return new ResponseEntity<>(hola, HttpStatus.OK);
	} 
	
	@GetMapping("/nombres")
	public ResponseEntity< List<NombreEntity> > obtenerNombres(){
		List<NombreEntity> nombres =serviceUno.obtenerNombres();
		
		return new ResponseEntity<>(nombres, HttpStatus.OK); 
	}  
	
	@GetMapping("/nombre")
	public ResponseEntity<NombreEntity> obtenerNombre(){ 
		NombreEntity nombre = serviceUno.obtenerNombre(); 
		return new ResponseEntity<>(nombre, HttpStatus.OK);
	}
	
	@PutMapping("/ejecutar") 
	public ResponseEntity<NombreEntity> ejecutar(@RequestBody NombreEntity nombreEntity){
		NombreEntity guardado = serviceUno.guardarNombre(nombreEntity);
		return new ResponseEntity<>(guardado, HttpStatus.OK); 
	} 
	
	@DeleteMapping("/borrar")
	public ResponseEntity<String> borrar(@RequestBody NombreEntity nombreEntity){
		serviceUno.borrarNombre(nombreEntity); 
		return new ResponseEntity<>("Se ha borrao", HttpStatus.OK); 
	}
}
