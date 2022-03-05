package enero17;

import java.util.Scanner;

public class Arreglo {

	public static void main(String[] args) {
	//	int[] array = { 4, 11, 2, 5, 6, 8, 2, 5, 6, 3};
		// System.out.println("El valor en la posicion 6 es: " + array[6]);
		
		/*for (int indice = 0; indice < array.length; indice++) {
			System.out.println("El valor de indice es: " + indice);
			System.out.println("El valor de la posicion es: " + array[indice]);
			System.out.println();
		}*/ 
		
		
		/*System.out.println("Dime un numero");
		Scanner scanner = new Scanner(System.in); 
		String texto = scanner.nextLine(); 
		
		int numIntroducido = Integer.valueOf(texto); //convertimos un texto en un entero
		int resultado = numIntroducido * 4; 
		System.out.println("El usuario introdujo: " + texto);
		System.out.println("El resultado de la operacion es: " + resultado);*/ 
		
		Coche coche = new Coche(5); 
		coche.setColor("Azul"); 
		System.out.println("El coche tiene "+coche.getNumPuertas()+" puertas"); 
		System.out.println("El color del coche es: " + coche.getColor());
	}  
	
	public static class Coche{
		private int numPuertas = 3; 
		private String color = "Verde"; 
		
		public Coche() {
			
		} 
		public Coche(int numPuertas) {
			this.numPuertas= numPuertas; 
		} 
		
		public String getColor() {
			return color; 
		} 
		public void setColor(String nuevoColor) {
			this.color = nuevoColor; 
		}
		public int getNumPuertas() {
			return numPuertas;
		}
		public void setNumPuertas(int numPuertas) {
			this.numPuertas = numPuertas;
		}
		
		
	}
	

}
