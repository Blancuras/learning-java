package feb24Polimorfismo;

public class TestAnimales {

	public static void main(String[] args) {
		Animal perro = new Perro("Boby", 5, 1); 
		perro.realizarSonido(); 
		
		System.out.println("");
		
		Animal gato = new Gato("Michi", 3, 50); 
		gato.realizarSonido();  
		
		System.out.println(""); 
		
		Animal loro = new Loro("Jaime", 2, 20); 
		loro.realizarSonido();
	}

}
