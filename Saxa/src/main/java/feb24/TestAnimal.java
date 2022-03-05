package feb24;

public class TestAnimal {

	public static void main(String[] args) {
		Nutria nutria = new Nutria("Gonzo", 123, 5); 
		nutria.comer(); 
		System.out.println(""); 
		nutria.nadar(); 
		System.out.println("");
		
		Perro perro = new Perro("Floffy", 321, 2); 
		perro.comer(); 
		perro.ladrar(); //Llamando al metodo 
		System.out.println(""); 
		
		Gato gato = new Gato("Kira", 456, 1); 
		gato.comer();
		gato.correr();
	
		Animal animal = new Animal("djhd", 545, 545);
		animal.comer();
	}

}
