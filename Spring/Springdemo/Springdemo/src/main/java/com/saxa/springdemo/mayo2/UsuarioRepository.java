package com.saxa.springdemo.mayo2;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long>{
	public List<UsuarioModel> findByPrioridad(Integer prioridad);
	
}
