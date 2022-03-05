package com.saxa.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.saxa.dtos.ProductDTO;
import com.saxa.services.ProductsServices;

@RestController
public class ProductsController {
	private List<ProductDTO> products = new ArrayList<>();
	
	@GetMapping("/get-products")
	public List<ProductDTO> getProducts(){
		return products; 
	}
	
	@PostMapping("/add-product")
	public List<ProductDTO> addProduct( @RequestBody ProductDTO productDTO){
		products.add(productDTO);
		return products; 
	}
		

	@GetMapping("/get-products/{name}")
	public ProductDTO getProductByName(@PathVariable String name) {
		ProductsServices service = new ProductsServices();
		return  service.searchProductByName(products, name);
	}



}


