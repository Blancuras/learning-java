package feb19;

public class Perimetro {
//CReamos los metodos para calcular los perimetros de las figuras geometricas
	
	//Creamos el metodo para calcular perimetro del cuadrado
	public float calcularPerimetroCuadrado(float lado) {
		float perimetro = 4 * lado; 
		return perimetro; 
	} 
	
	//Creamos el metodo para calcular perimetro del trinagulo
	public float calcularPerimetroTriangulo(float primerLado, float segundoLado, float tercerLado) {
		float perimetro = primerLado + segundoLado + tercerLado; 
		return perimetro; 
	}  
	
	//Creamos el metodo para calcular perimetro del circulo
	public float calcularPerimetroCirculo(float diametro) {
		float perimetro = (float)(diametro * Math.PI);
		return perimetro; 
	} 
	
	//Creamos el metodo para calcular perimetro del rectangulo
	public float calcularPerimetroRectangulo(float base, float altura) {
		float perimetro = 2 * (base) + 2 * (altura); 
		return perimetro; 
	}

	
	
}
