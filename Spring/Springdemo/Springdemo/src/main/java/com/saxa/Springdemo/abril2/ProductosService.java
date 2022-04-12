package com.saxa.Springdemo.abril2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductosService {

	@Autowired
	private ProductosRepository productoRepository;

	public List<ProductoEntity> consultarProductos() { // llama a los metodos del repository
		return productoRepository.findAll();
	}


	

}
