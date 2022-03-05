package com.colecciones.listas.ejerciciolistas;

public class VideoJuego implements Entregable {

	public final static int MAYOR = 1;
	public final static int MENOR = -1;
	public final static int IGUAL = 0;

	private String titulo;
	private int horasEstimadas;
	private boolean esEntregado;
	private String genero;
	private String compañia;

	public boolean equals(VideoJuego juego) {
		if(titulo.equalsIgnoreCase(juego.getTitulo()) && compañia.equalsIgnoreCase(juego.getCompañia())){
			return true; 
		} 
		return false; 
	}

	public VideoJuego(String titulo, int horasEstimadas, String genero, String compañia) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.esEntregado = false;
		this.genero = genero;
		this.compañia = compañia;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public boolean isEntregado() {
		return esEntregado;
	}

	public void setEntregado(boolean entregado) {
		this.esEntregado = entregado;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
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
	public void entregar() {

	}

	@Override
	public void devolver() {

	}

	@Override
	public boolean comprobarSiElArticuloEsEntregado() {
		return false;
	}

	@Override
	public int compareTo(Object objeto) {
		int estado = MENOR;

		VideoJuego juego = (VideoJuego) objeto;

		if (horasEstimadas > juego.getHorasEstimadas()) {
			estado = MAYOR;
		} else if (horasEstimadas == juego.getHorasEstimadas()) {
			estado = IGUAL;
		}
		return estado;
	}

	@Override
	public int compareTo() {
		return 0;
	}


}
