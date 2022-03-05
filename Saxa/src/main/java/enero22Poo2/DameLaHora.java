package enero22Poo2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class DameLaHora  implements ActionListener{ //Implementamos todos los metodos
	public void actionPerformed(ActionEvent evento) {
		Date ahora = new Date(); 
		System.out.println("Te pongo la hora cada 5 segundos: " + ahora);
	}
}
