package enero28;
/*
 * Si yo me emborracho con 2 litros de cerveza y un vaso mide 6 cm de diametro y 
 * 10 cm de altura. Cuantos vasoos debo tomar para emborracharme.Sabiendo que la 
 * formula del volumen de un cilindro es V=πr²h. r =d/2.
 */
public class VolumenDeUnCilindro {

	public static void main(String[] args) {
		float diametro = 6; 
		float altura = 10; 
		double volumen;  
		float pi = 3.1416f; 
		float radio = diametro / 2; 
		volumen= pi * Math.pow(radio, 2) * altura; 
		System.out.println("Volumen de un vaso de cerveza es: " + volumen);
		float litros = 2; 
		float mililitrosParaEmborracharme = litros * 1000; 
		double limiteVasos = mililitrosParaEmborracharme / volumen; 
		System.out.println("Yo me emborracho con: " + limiteVasos + " vasos de cerveza");
	}

}
