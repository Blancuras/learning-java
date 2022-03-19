package spring.marzo17;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
	@Autowired 
	UsuarioRepository usuarioRepository; 
	
	public ArrayList<UsuarioModel> obtenerUsuarios(){
		return (ArrayList<UsuarioModel>) usuarioRepository.findAll(); 
		}
	
	public UsuarioModel guardarUsuario(UsuarioModel usuario) {
		return usuarioRepository.save(usuario);
	}
}
