package spring.marzo12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // administra todos los metodos a una url
@RequestMapping("/calculadora")
public class CalculadoraController {

	@Autowired // crear instancias
	private CalculadoraService calculadoraService;

	@PostMapping("/suma") // verbo http
	public ResponseEntity<Double> bchjgddhjcdhcv(@RequestBody NumerosDTO numerosDTO) {
		Double resultado = calculadoraService.suma(numerosDTO.getNum1(), numerosDTO.getNum2());
		return new ResponseEntity<>(resultado, HttpStatus.OK);
	}

	@PostMapping("/conversor-celsius")
	public ResponseEntity<Double> conversorCelsius(@RequestBody GradosDTO gradosDTO) {
		Double resultado = calculadoraService.convertirAFharenheit(gradosDTO.getCelsius());
		return new ResponseEntity<>(resultado, HttpStatus.OK);
	}

	@PutMapping("/peso")
	public ResponseEntity<String> calculaTuPeso(@RequestBody NumeroDTO numeroDTO) {
		String peso = calculadoraService.calculaTuPeso(numeroDTO.getNum());
		return new ResponseEntity<>(peso, HttpStatus.OK);
	}

	@PostMapping("/nombre")
	public ResponseEntity<String> dimeTuNombre(@RequestBody NombreDTO nombreDTO) {
		String nombre = calculadoraService.dimeTuNombre(nombreDTO.getNombre());
		return new ResponseEntity<>(nombre, HttpStatus.OK);
	}
}
