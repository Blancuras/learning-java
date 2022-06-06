package com.saxa.springdemo.abril18;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "18-abril")
public class HomeController {
	
	@GetMapping("/")
	public String inicio() {
		return "Hola Mundo";
	}
}
