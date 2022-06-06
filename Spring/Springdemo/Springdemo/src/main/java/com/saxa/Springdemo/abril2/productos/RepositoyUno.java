package com.saxa.springdemo.abril2.productos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saxa.springdemo.abril2.nombres.NombreEntity;

@Repository
public interface RepositoyUno extends JpaRepository<NombreEntity, Long> {

}
