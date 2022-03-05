package febTres;

public class Principal {

	public static void main(String[] args) {
		Planta planta = new Planta();  //Creando o instanciando un Objeto
		AnimalCarnivoro animalCarnivoro = new AnimalCarnivoro(); 
		
		
		planta.alimentarse(); 
		animalCarnivoro.alimentarse();	
	}

}
