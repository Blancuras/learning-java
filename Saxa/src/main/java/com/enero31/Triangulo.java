package com.enero31;

//Esta clase se encarga de calcular el la area del triangulo en base a los lados de este
public class Triangulo extends Terreno{
	
	private double lado1;  
	private double lado2; 
	private double lado3;
	
	
	//Inicializamos los lados del triangulo
	public Triangulo(double lado1, double lado2 ,double lado3) {
		super(3);
		this.lado1 = lado1;  
		this.lado2 = lado2; 
		this.lado3 = lado3; 
	}
	

	public double getLado1() {
		return lado1;
	}


	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}


	public double getLado2() {
		return lado2;
	}


	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}


	public double getLado3() {
		return lado3;
	}


	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}


	@Override
	public String toString() {
		return "Triangulo " + super.toString() + " [lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + "]";
	}   
	
	//Se calcula el area usando  la formula de Heron  
	//return va a retornar el area del triangulo
	public double area() {
		double semiperimetro = (this.lado1 + this.lado2 + this.lado3) / 2; 
		return Math.sqrt(semiperimetro * (semiperimetro - this.lado1) * (semiperimetro - this.lado2) * (semiperimetro - this.lado3) ); 
	}
	
	
	
}
