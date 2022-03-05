package com.colecciones.listas.ejerciciolistas;

import java.util.Objects;

public class Serie implements Entregable {

	public final static int MAYOR = 1;
	public final static int MENOR = -1;
	public final static int IGUAL = 0;

	private String titulo;
	private int numeroDeTemporadas;
	private boolean esEntregado;
	private String genero;
	private String creador;

	public Serie(String titulo, int numeroDeTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numeroDeTemporadas = numeroDeTemporadas;
		this.esEntregado = false;
		this.genero = genero;
		this.creador = creador;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroDeTemporadas() {
		return numeroDeTemporadas;
	}

	public void setNumeroDeTemporadas(int numeroDeTemporadas) {
		this.numeroDeTemporadas = numeroDeTemporadas;
	}

	public boolean isEsEntregado() {
		return esEntregado;
	}

	public void setEsentregado(boolean esentregado) {
		esEntregado = esentregado;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public static int getMayor() {
		return MAYOR;
	}

	public static int getMenor() {
		return MENOR;
	}

	public static int getIgual() {
		return IGUAL;
	}

	@Override
	public String toString() {
		return "\nInformacion de la Serie: \n" + "\tTitulo: " + titulo + "\n" + "\tNumero de Temporadas: "
				+ numeroDeTemporadas + "\n" + "\tGenero: " + genero + "\n" + "\tCreador: " + creador;
	}

	@Override
	public int hashCode() {
		return Objects.hash(creador, titulo);
	}

	public boolean equals(Serie serie) {
		if (titulo.equalsIgnoreCase(serie.getTitulo()) && creador.equalsIgnoreCase(serie.getCreador())) {
			return true;
		}
		return false;
	}

	@Override
	public void entregar() {
		esEntregado = true;
	}

	@Override
	public void devolver() {
		esEntregado = false;
	}

	@Override
	public boolean comprobarSiElArticuloEsEntregado() {
		if (esEntregado) {
			return true;

		}
		return false;
	}

	@Override
	public int compareTo(Object objeto) {
		int estado = MENOR;

		Serie serie = (Serie) objeto;
		if (numeroDeTemporadas > serie.getNumeroDeTemporadas()) {
			estado = MAYOR;
		} else if (numeroDeTemporadas == serie.getNumeroDeTemporadas()) {
			estado = IGUAL;
		}
		return estado;
	}

	@Override
	public int compareTo() {
		return 0;
	}

}
