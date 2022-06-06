package com.saxa.springdemo.abril2.nombres;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NombreDAORepositories extends JpaRepository<NombreEntity, Long>{

}
