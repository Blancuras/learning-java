package spring.config;

import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Validated
@Controller
@RequestMapping(value = "/paginas")
public class UrlsController {

	@GetMapping("/hola")
	public String holapage() {
		System.out.println("Page");
		return "holapage.html";
	}
	@GetMapping("/hola1")
	public String holapage1() {
		System.out.println("Page");
		return "templates/holapage";
	}
	@GetMapping("/hola3")
	public String holapage3() {
		System.out.println("Page");
		return "templates/holapage.html";
	}
	@GetMapping("/hola2")
	public String holapage2() {
		System.out.println("Page");
		return "holapage";
	}
	
	@GetMapping("/hola4")
	public String holapage4() {
		System.out.println("index2");
		return "index2";
	}
	
	@GetMapping("/hola5")
	public String holapage5() {
		System.out.println("index2.html");
		return "index2.html";
	}
}
