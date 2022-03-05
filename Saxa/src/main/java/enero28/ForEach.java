package enero28;

public class ForEach {

	public static void main(String[] args) {
		String []perros = {"Monte ", "Chupacabras", "Solovino", "Chimuelo", "Wera", "Chiquito"};
		/*for (int indice = 0; indice<perros.length; indice++) {
			System.out.println(perros[indice]);
		}*/ 
		
		for(String perro11: perros) {
			System.out.println(perro11);
		}
		
		
	}

}
