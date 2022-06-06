package com.saxa.springdemo.abril18;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/17-abril")
public class Persona5Rest {
		
	@Autowired
	private Persona5DAO persona5DAO; //Inyeccion de depenedencias 
	
	//Metodos HTTP- solicitud al servidor 
	@PostMapping("/guardar")
	public void guardar(@RequestBody Persona5 persona) {
		persona5DAO.save(persona);
	} 
	
	@GetMapping("/listar")
	public List<Persona5>listar(){
		return persona5DAO.findAll();
	} 
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		persona5DAO.deleteById(id);
	} 
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Persona5 persona5) {
		persona5DAO.save(persona5); 
	}
	
}
