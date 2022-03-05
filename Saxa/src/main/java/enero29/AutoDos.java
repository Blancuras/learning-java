package enero29;

public class AutoDos {

	public static void main(String[] args) {
		Auto vocho = new Auto(); 
		vocho.setModelo("1990"); 
		vocho.setMarca("vocho"); 
		vocho.setColor("azul"); 
		
		vocho.meterLlave("123456");
		vocho.mando("enciende"); 
		
		System.out.println("Auto "+ vocho);
		/*vocho.enciende(); 
		vocho.acelera(); 
		vocho.frenar(); 
		System.out.println("Marca " + vocho.marca);*/
	}

}
