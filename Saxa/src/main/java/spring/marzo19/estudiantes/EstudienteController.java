package spring.marzo19.estudiantes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/19-marzo")
public class EstudienteController {

	@Autowired
	private EstudianteService estudianteService;

	// Endpoint 1
	@PostMapping("/guardar")
	public ResponseEntity<EstudianteEntity> guardar(@RequestBody EstudianteEntity estudiante) {
		estudiante = estudianteService.guardar(estudiante);
		return new ResponseEntity<>(estudiante, HttpStatus.CREATED);
	}

	// Endpoin 2
	@GetMapping("/obtener")
	public ResponseEntity<List<EstudianteEntity>> getEstudiantes() {
		List<EstudianteEntity> estudiantes = estudianteService.getEstudiates();
		return new ResponseEntity<>(estudiantes, HttpStatus.OK);
	}

	// Endpoint 3
	@PutMapping("/actualizar")
	public ResponseEntity<EstudianteEntity> actualizar(@RequestBody EstudianteEntity estudianteDTO) {
		EstudianteEntity estudiante = estudianteService.actualizar(estudianteDTO);
		return new ResponseEntity<>(estudiante, HttpStatus.OK);
	} 
	
	@DeleteMapping("/borrar/{id}")
	public ResponseEntity<String> borrar(@PathVariable(value = "id") Long id) {
		String borrar = estudianteService.borrar(id);
		return new ResponseEntity<>(borrar, HttpStatus.OK);
	}
}
