package com.empleados;

import java.sql.Date;

public class Trabajador {
	private String nombre;
	private String puesto;
	private String direccion;
	private int telefono;
	private Date fechaNacimiento;
	private int fechaContratacion;

	public Trabajador(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getFechaContratacion(){
		return fechaContratacion;
	}

	public void setFechaContratacion(int fechaContratacion) {
		this.fechaContratacion = fechaContratacion;
	} 
	
	public double calcularPaga() {
		return 0.0;
	}
	

}
