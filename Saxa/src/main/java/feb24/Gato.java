package feb24;

public class Gato extends Animal{

	public Gato(String nombre, int id, int edad) {
		super(nombre, id, edad); 
	}

	@Override
	public void comer() {
		System.out.println("El gato come atun");
		System.out.println("El nombre del gato es: " + nombre);
		System.out.println("El id del gato es " + id); 
		System.out.println("La edad del gato es " + edad);
	}  
	
	public void correr() {
		System.out.println("El gato esta corriendo");
	}

}
