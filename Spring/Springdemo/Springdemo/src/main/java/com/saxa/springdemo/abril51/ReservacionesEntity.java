package com.saxa.springdemo.abril51;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "reservaciones")
public class ReservacionesEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String apellido;
	private LocalTime hora;
	private LocalDate fecha;
	private Integer cantidadMesas;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public LocalTime getHora() {
		return hora;
	}
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public Integer getCantidadMesas() {
		return cantidadMesas;
	}
	public void setCantidadMesas(Integer cantidadMesas) {
		this.cantidadMesas = cantidadMesas;
	}

	

}
