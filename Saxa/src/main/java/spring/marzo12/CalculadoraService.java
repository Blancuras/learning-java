package spring.marzo12;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

	public double suma(double num1, double num2) {
		return num1 + num2;
	}
	
	public double convertirAFharenheit(double celsius) { //
		return celsius * 1.8 + 32;
	} 
	
	public String calculaTuPeso(double peso) {
		return "Tu peso es " + peso;
	} 
	
	public String dimeTuNombre(String nombre) {
		return "Tu nombre es " + nombre;
	}
}
