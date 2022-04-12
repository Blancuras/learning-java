package com.saxa.Springdemo.abril2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/dos-abril")
public class ProductoController {

	@Autowired 
	private ProductosService productosService; 
	
	@GetMapping("/productos") 
	public ResponseEntity< List<ProductoEntity> >obtenerProductos(){
		List<ProductoEntity> productos = productosService.consultarProductos();
		return new ResponseEntity<>(productos, HttpStatus.CREATED);
	} 
	

	
	
}
