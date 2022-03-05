package feb19;

public class Heron {
	
	//Creamos el metodo para calcular la ley de heron 
	public static float calcularLeyDeHeron(float ladoA, float ladoB, float ladoC) {
		float area = (ladoA + ladoB + ladoC) / 2;  
		float resultado = (float) (Math.sqrt(area *(area - ladoA) * (area - ladoB) * (area - ladoC)));
		return resultado; 
	}
}
