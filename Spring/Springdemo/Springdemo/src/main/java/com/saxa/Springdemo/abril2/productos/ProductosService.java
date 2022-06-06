package com.saxa.springdemo.abril2.productos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductosService {

	@Autowired
	private ProductosDaoRepositories productoRepository;

	public List<ProductoEntity> consultarProductos() { // llama a los metodos del repository
		return productoRepository.findAll();
	}


	

}
