package com.saxa.springdemo.mayo3;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsuarioServicio {
	
	@Autowired 
	private UsuarioRepositorio usuarioRepositorio;
	
	public List<UsuarioModelo> obtenerUsuarios(){
		return usuarioRepositorio.findAll();
	} 
	
	public UsuarioModelo guardarUsuario(UsuarioModelo usuario) {
		return usuarioRepositorio.save(usuario);
	} 
	
	public Optional<UsuarioModelo>ObtenerPorId(Long id){
		return usuarioRepositorio.findById(id);
	}
	
	public List<UsuarioModelo> obtenerPorPrioridad(Integer prioridad){
		return usuarioRepositorio.findByPrioridad(prioridad); 
	} 
	
	public boolean eliminarUsuario(Long id) {
		try {
			usuarioRepositorio.deleteById(id);
			return true; 
		}catch(Exception error) {
			return false; 
		} 
	}
	
	
	
	
}
