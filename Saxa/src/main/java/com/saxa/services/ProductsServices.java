package com.saxa.services;

import java.util.List;

import com.saxa.dtos.ProductDTO;

public class ProductsServices {
	
	public ProductDTO searchProductByName(List<ProductDTO> products , String name) {
		return products.stream()
				.filter(product -> product.getName() .equalsIgnoreCase(name.trim()))
				.findFirst()
				.orElse(null);
	}
	
	
}
