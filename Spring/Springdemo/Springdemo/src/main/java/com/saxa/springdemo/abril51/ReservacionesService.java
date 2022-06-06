package com.saxa.springdemo.abril51;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.saxa.springdemo.errores.GenericError;

@Service
public class ReservacionesService {

	@Autowired
	private ReservacionesRepository reservacionesRepository;

	public ReservacionesEntity crear(ReservacionesEntity reservacionesEntity) {
		reservacionesEntity.setHora(LocalTime.now());
		reservacionesEntity.setFecha(LocalDate.now());
		return reservacionesRepository.save(reservacionesEntity);
	}

	public ReservacionesEntity actualizar(ReservacionesEntity reservacionesEntity) {
		ReservacionesEntity encontrado = reservacionesRepository.findById(reservacionesEntity.getId())
				.orElseThrow(() -> new GenericError("Id no encontrado"));

		encontrado.setApellido(reservacionesEntity.getApellido());
		encontrado.setCantidadMesas(reservacionesEntity.getCantidadMesas());
		encontrado.setNombre(reservacionesEntity.getNombre());
		encontrado.setFecha(LocalDate.now());
		encontrado.setHora(LocalTime.now());
		ReservacionesEntity encontradoconNuevosDAtos = reservacionesRepository.save(encontrado);
		return encontradoconNuevosDAtos;

	}

	public List<ReservacionesEntity> obtener() {
		return reservacionesRepository.findAll();

	} 
	
	public String borrar(ReservacionesEntity reservacionesEntity) {
		if (reservacionesEntity.getId() == null) {
			throw new GenericError("El id no puede ser null");
		}
		
		reservacionesRepository.findById(reservacionesEntity.getId())
		.orElseThrow(() -> new GenericError("Id no encontrado"));
		
		reservacionesRepository.delete(reservacionesEntity);
		
		return "Se borro";
	}
}
