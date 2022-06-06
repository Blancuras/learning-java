package com.funcionesLogicasLavadora;

public class FuncionesLavadora {

	private int kilos = 0;
	private int llenadoCompleto = 0;
	private int tipoDeRopa = 0;
	private int lavadoCompleto = 0;
	private int secadoCompleto = 0;

	public FuncionesLavadora(int kilos, int tipoDeRopa) {
		this.kilos = kilos;
		this.tipoDeRopa = tipoDeRopa;
	}

	private void llenado() {
		if (kilos <= 12) {
			llenadoCompleto = 1;
			System.out.println("Llenando...");
			System.out.println("Llenado completo.");
		} else {
			System.out.println("La carga de ropa es muy pesada, reduce la carga");
		}
	}

	private void lavado() {
		llenado();
		//validation
		if (llenadoCompleto != 1) {
			return;
		}
		
		if (tipoDeRopa == 1) {
			System.out.println("Ropa blanca / Lavado suave ");
			System.out.println("Lavando...");
			lavadoCompleto = 1;
		} else if (tipoDeRopa == 2) {
			System.out.println("Ropa de color / lavado intenso");
			System.out.println("Lavando...");
			lavadoCompleto = 1;
		} else {
			System.out.println("El tipo de ropa no esta disponible");
			System.out.println("Se lavara como ropa de color / Lavado intenso");
			lavadoCompleto = 1;
		}

	}

	private void secado() {
		lavado();
		if (lavadoCompleto == 1) {
			System.out.println("Secando...");
			secadoCompleto = 1;
		}
	}

	public void cicloFinalizado() {
		secado();
		if (secadoCompleto == 1) {
			System.out.println("Tu ropa ya esta lista!");
		}
	}

	public int getKilos() {
		return kilos;
	}

	public void setKilos(int kilos) {
		this.kilos = kilos;
	}

	public int getLlenadoCompleto() {
		return llenadoCompleto;
	}

	public void setLlenadoCompleto(int llenadoCompleto) {
		this.llenadoCompleto = llenadoCompleto;
	}

	public int getTipoDeRopa() {
		return tipoDeRopa;
	}

	public void setTipoDeRopa(int tipoDeRopa) {
		this.tipoDeRopa = tipoDeRopa;
	}

	public int getLavadoCompleto() {
		return lavadoCompleto;
	}

	public void setLavadoCompleto(int lavadoCompleto) {
		this.lavadoCompleto = lavadoCompleto;
	}

	public int getSecadoCompleto() {
		return secadoCompleto;
	}

	public void setSecadoCompleto(int secadoCompleto) {
		this.secadoCompleto = secadoCompleto;
	}

	
}
