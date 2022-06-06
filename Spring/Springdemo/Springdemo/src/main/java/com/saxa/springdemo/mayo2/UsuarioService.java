package com.saxa.springdemo.mayo2;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	public List<UsuarioModel> obtenerUsuarios() {
		return usuarioRepository.findAll();
	} 
	
	public UsuarioModel guardarUsuario(UsuarioModel usuario) {
		return usuarioRepository.save(usuario);
	} 
	
	public Optional<UsuarioModel> obtenerPorId(Long id){
		return usuarioRepository.findById(id);
	} 
	
	public List<UsuarioModel> obtenerPorPrioridad(Integer prioridad){
		return usuarioRepository.findByPrioridad(prioridad); 
	} 
	
	public boolean eliminarUsuario(Long id) {
		try {
			usuarioRepository.deleteById(id);
			return true; 
		}catch(Exception error) {
			return false;
		}
	}
}
