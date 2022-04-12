package com.saxa.Springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/paginas")
public class URLController {

	@GetMapping("/reservaciones")
	public String reservaciones() {
		System.out.println("abriendo reservaciones");
		return "reservaciones.html";
	}
	
	@GetMapping("/nombres")
	public String nombres() {
		System.out.println("abriendo nombres");
		return "nombres.html";
	}
}
