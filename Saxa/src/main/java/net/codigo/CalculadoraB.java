package net.codigo;

public class CalculadoraB {
	private int num1;
	private int num2;

	public void setA(int a) {
		this.num1 = a;
	}

	public void setB(int b) {
		this.num2 = b;
	}

	public int sumar() {
		return num1 + num2;
	}

	public int add(int num1, int num2) {
		return num1 + num2;
	}

	public int resta(int num1, int num2) {
		return num1 - num2;
	}

	public void inicializar() {
		num1 = 0;
		num2 = 0;
	}

	public int div(int num1, int num2) {
		return num1 / num2; 
	}
}
