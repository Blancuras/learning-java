package com.saxa.springdemo.mayo2;

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
@RequestMapping("/2-mayo/usuario/")
public class UsuarioController {
	@Autowired
	private UsuarioService usuarioService;

	@GetMapping()
	public List<UsuarioModel> obtenerUsuarios() {
		return usuarioService.obtenerUsuarios();
	}

	@PostMapping()
	public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario) {
		return this.usuarioService.guardarUsuario(usuario);
	}

	@GetMapping(path = "/{id}")
	public Optional<UsuarioModel> obtenerUsuarioPorId(@PathVariable("id") Long id) {
		return this.usuarioService.obtenerPorId(id);
	}

	@GetMapping("/query")
	public List<UsuarioModel> obtenerUsuarioPorPrioridad(@RequestParam("prioridad") Integer prioridad) {
		return this.usuarioService.obtenerPorPrioridad(prioridad);
	}

	@DeleteMapping(path = "/{id}")
	public String eliminarPorId(@PathVariable("id") Long id) {
		boolean eliminado = usuarioService.eliminarUsuario(id);
		if (eliminado) {
			return "Se elimino el usuario con id " + id;
		} else {
			return "No se pudo eliminar el usuario con id " + id;
		}
	}

}
