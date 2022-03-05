package feb23BucleForEach;

public class Test {
	
	public static void main(String[] args) {
		
		/*String nombres[] = new String[3]; 
		nombres[0] = "Alejandra"; 
		nombres[1] = "Vero"; 
		nombres[2] = "Juan";
		
		for(String elemento: nombres) {
			System.out.println(elemento);
		}*/ 
		
		//Creamos el arreglo de objetos 
		Persona personas[] = new Persona[4]; 
		personas[0] = new Persona("Teresa", "Chavez", 35, 123456); 
		personas[1] = new Persona("Vero", "Ramirez", 16, 121756); 
		personas[2] = new Persona("Maria", "Perez", 25, 8353435); 
		personas[3] = new Persona("Pablo", "Cruz", 28, 37373848); 
		
		for(Persona persona : personas) {
			persona.mostrarDatos();
			System.out.println(" ");  
		}
		
	}
}
