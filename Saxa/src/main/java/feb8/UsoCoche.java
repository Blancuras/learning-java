package feb8;

import javax.swing.JOptionPane;

public class UsoCoche {

	public static void main(String[] args) {
		Coche micoche = new Coche(); 
		
		micoche.estableceColor(JOptionPane.showInputDialog("Introduce color: "));  
		System.out.println(micoche.dimeDatosGenerales());
		System.out.println(micoche.dimeColor()); 
		micoche.configuraAsientos(JOptionPane.showInputDialog("Tiene asientos de cuero")); 
		System.out.println(micoche.dimeAsientos());
		micoche.configuraClimatizador(JOptionPane.showInputDialog("Tiene climatizador"));
		System.out.println(micoche.dimeClimatizador()); 
		System.out.println(micoche.dimePesoCoche());
		System.out.println("El precio final del coche es: " + micoche.precioCoche());
		
	}
}
