package com.saxa.springdemo.mayo3;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositorio extends JpaRepository<UsuarioModelo, Long> {
	public List<UsuarioModelo> findByPrioridad(Integer prioridad);
}
