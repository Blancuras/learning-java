package com.pruebaunitaria;

public class CalculadoraTestB {
	
	private int ans;
	public void CalculadoraB() {
		ans = 0;
	} 
	public int sub(int a, int b) {
		ans = a -b; 
		return ans; 
	}  
	
	public int div(int a, int b) {
		if(b == 0) {
			throw new ArithmeticException("No puedes dividir entre cero");
		}
		ans = a / b; 
		return ans; 
	}
	
	public int add(int v) {
		ans += v; 
		return ans; 
	} 
	public int sub(int v) {
		ans -= v; 
		return ans; 
	} 
	
	public int ans() {
		return ans; 
	} 
	
	public void clear() {
		ans = 0; 
	} 
	
	public void operationOptima() {
		for(;;); 
	}
}
