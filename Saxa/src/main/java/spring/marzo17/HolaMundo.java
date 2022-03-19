package spring.marzo17;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/marzo17")
public class HolaMundo {

	@GetMapping("/")
	public String hola() {
		return "Hola mundo";
	}
}
