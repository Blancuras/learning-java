package feb17;

public class Sobrecarga {
	
	//Sobre carga de constructores
	public Sobrecarga(int edad) {
		System.out.println("La edad es: " + edad); 
	} 
	
	//Sobre carga de constructores
	public Sobrecarga(int kilometros, String nombre) {
		System.out.println("La persona " + nombre + " corre " + kilometros);
	} 
	
	//Sobre carga de constructores
	public Sobrecarga(float altura) {
		System.out.println("La altura de la persona es " + altura);
	} 
	
	public int calcularCuantosAniosTienes(int fechaActual, int fechaNacimiento) {
		int edad = fechaActual - fechaNacimiento; 
		return edad; 
	} 
	
	public int multiplicar() {
		return 10 * 20; 
	}  
	
	public int multiplicar(int num1, int num2) {
		return num1 * num2; 
	}  
	
	public void saludar() {
		System.out.println("Hola, buenas noches");
	}
}
