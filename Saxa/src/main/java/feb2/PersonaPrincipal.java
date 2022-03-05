package feb2;

public class PersonaPrincipal {
	public static void main(String[] args) {
		Persona persona1 = new Persona("Juan", 30);  
		
		persona1.correr(); 
		
		Persona persona2 = new Persona("123456") ; 
		persona2.correr(100);
	}

}
