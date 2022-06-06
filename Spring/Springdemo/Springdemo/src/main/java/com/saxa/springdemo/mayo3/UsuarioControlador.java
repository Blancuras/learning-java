package com.saxa.springdemo.mayo3;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mayo-3/usuario")
public class UsuarioControlador {
	@Autowired 
	private UsuarioServicio usuarioServicio; 
	
	@GetMapping()
	public List<UsuarioModelo> obtenerUsuarios(){
		return usuarioServicio.obtenerUsuarios();
	} 
	
	@PostMapping  
	public UsuarioModelo guardarUsuario(@RequestBody UsuarioModelo usuario) {
		return usuarioServicio.guardarUsuario(usuario);
	} 
	
	@GetMapping( path = "/{id}") 
	public Optional<UsuarioModelo> obtenerUsuarioPorId(@PathVariable("id") Long id){
		return usuarioServicio.ObtenerPorId(id);
	} 
	
	@GetMapping("/query") 
	public List<UsuarioModelo> obtenerUsuarioPorPrioridad(@RequestParam("prioridad") Integer prioridad){
		return usuarioServicio.obtenerPorPrioridad(prioridad);
	} 
	
	@DeleteMapping( path = "/{id}") 
	public String eliminarPorId(@PathVariable("id") Long id) {
		boolean eliminado = usuarioServicio.eliminarUsuario(id);
		if(eliminado) {
			return "Se elimino el usuario con id " + id;
		} else {
			return "No pudo eliminar el usuario con id " + id;
		}
	}
}
