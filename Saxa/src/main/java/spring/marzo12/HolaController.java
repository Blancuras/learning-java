package spring.marzo12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HolaController {

	@Autowired
	private FechaService fechaService;

	@GetMapping("/fecha1")
	public ResponseEntity<String> fecha1() {
		String fechaActual = fechaService.fechaSinFormato();
		return new ResponseEntity<>(fechaActual, HttpStatus.OK);
	}
	

	
	
	@PostMapping("/fecha2")
	public ResponseEntity<String> fecha2() {
		String fechaActual = fechaService.fechaSinFormato();
		
		return new ResponseEntity<>(fechaActual, HttpStatus.OK);
	}
}
