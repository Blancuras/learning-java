package com.saxa.Springdemo.abril2.nombres;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NombreRepository extends JpaRepository<NombreEntity, Long>{

}
