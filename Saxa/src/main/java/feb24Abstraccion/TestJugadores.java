package feb24Abstraccion;

public class TestJugadores {
	
	public static void main(String[] args) {
		JugadorFutbol jugadorFutbol = new JugadorFutbol("Leonel Messi", 32); 
		jugadorFutbol.jugar();
		jugadorFutbol.quienVaAGanar();
		
		System.out.println("");  
		
		JugadorBasquet jugadorBasquet = new JugadorBasquet("Michael Jordan", 40); 
		jugadorBasquet.jugar();
		
		Jugador jugador = new JugadorBasquet("Michael Jordan", 40); 
	}
}
