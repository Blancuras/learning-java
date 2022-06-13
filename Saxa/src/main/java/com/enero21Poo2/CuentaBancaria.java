package com.enero21Poo2;

public class CuentaBancaria {
	private String claveBancaria;
	private String alias;
	private double saldo;

	void mostrarDatos() {
		System.out.println(claveBancaria + " " + alias + " " + saldo);

	}

	@Override
	public String toString() {
		return " CuentaBancaria [claveBancaria=" + claveBancaria + ", alias=" + alias + ", saldo=" + saldo + "]";
	}

	double getSaldo() {
		return saldo;
	}

	void setAlias(String nuevoAlias) {
		if (nuevoAlias != null) {
			alias = nuevoAlias;
		}
	}

	void setClaveBancaria(String nuevaClave) {
		if (nuevaClave != null) {
			claveBancaria = nuevaClave;
		}
	}

	void depositar(double monto) {
		if (monto > 0) {
			saldo = saldo + monto;
		}
	}

	boolean saldoDisponible(double monto) {
		return saldo >= monto;
	}

	void extraer(double monto) {
		if (saldoDisponible(monto)) {
			saldo = saldo - monto;
		}
	}
}
