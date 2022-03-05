package feb10;

import java.util.Scanner;

public class PlanoCartesiano {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int coordenadaX;
		int coordenadaY;

		System.out.println("Digite la coordenada x del piano cartesiano: ");
		coordenadaX = entrada.nextInt();

		System.out.println("Digite la coordenada y el plano cartesiano: ");
		coordenadaY = entrada.nextInt();

		System.out.println("");

		if (coordenadaX > 0 && coordenadaY > 0) {
			System.out.println("Las coordenadas enstan en el primer cuadrante Ic ");
		} else if (coordenadaX < 0 && coordenadaY > 0) {
			System.out.println("Las coordenadas estan en el segundo cuadrante IIc");
		} else if (coordenadaX < 0 && coordenadaY < 0) {
			System.out.println("Las coordenadas estan el el tercer cuadrante IIIc");
		} else if (coordenadaX > 0 && coordenadaY < 0) {
			System.out.println("Las coordenadas estan en el cueto cuadrante");
		}
	}

}
