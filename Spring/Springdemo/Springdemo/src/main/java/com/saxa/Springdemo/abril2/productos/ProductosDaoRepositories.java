package com.saxa.springdemo.abril2.productos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductosDaoRepositories  extends JpaRepository<ProductoEntity, Long>{

}
