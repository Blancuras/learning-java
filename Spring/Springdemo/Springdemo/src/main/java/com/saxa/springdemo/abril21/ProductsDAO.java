package com.saxa.springdemo.abril21;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsDAO extends JpaRepository<Product, Long>{

}
