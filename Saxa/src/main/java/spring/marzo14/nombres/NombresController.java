package spring.marzo14.nombres;

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
 
//Controlador
@RestController
@RequestMapping(value = "/nombres")
public class NombresController {

	@Autowired //creamos instancia
	private NombresService nombreService;
	@Autowired
	private ChuchitaService chuchitaService;
	
	//Endpoint 1
	@PostMapping("/guardar") // verbo http
	public ResponseEntity<Long> greeting(@RequestBody NombreDTO nombreDTO) {
		Long idGenerada =  nombreService.save(nombreDTO.getNombreChamaco());
		chuchitaService.horaChuchita();
		return new ResponseEntity<>(idGenerada, HttpStatus.OK);
	}
	
	//Endpoin 2
	@GetMapping("/obtener") 
	public ResponseEntity<List<NombreEntity>> getNombres(){
		List<NombreEntity> nombres= nombreService.getNombres(); 
		return new ResponseEntity<>(nombres, HttpStatus.OK);
	} 
	
	//Endpoint 3
	@PutMapping("/actualizar") // verbo http
	public ResponseEntity<Long> actualizar(@RequestBody NombreDTO nombreDTO) {
		Long idGenerada =  nombreService.actualizar(nombreDTO);
		return new ResponseEntity<>(idGenerada, HttpStatus.OK);
	}
}
