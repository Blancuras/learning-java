//Mostrar los multiplos de 8 hasta el valor 500. 
//Debe aparecer en pantalla 8,16,24, etc
package feb10; 

public class Multiplos8 {

	public static void main(String[] args) {
		for (int iterador = 1; iterador <= 500; iterador++) {
			if(iterador % 8 == 0) {
				System.out.println(iterador);
			}
		}
	}

}
