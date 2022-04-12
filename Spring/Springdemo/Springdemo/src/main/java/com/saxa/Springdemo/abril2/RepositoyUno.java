package com.saxa.Springdemo.abril2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saxa.Springdemo.abril2.nombres.NombreEntity;

@Repository
public interface RepositoyUno extends JpaRepository<NombreEntity, Long> {

}
