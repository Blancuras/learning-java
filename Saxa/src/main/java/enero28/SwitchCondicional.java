package enero28;

import java.util.Scanner;

public class SwitchCondicional {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Seleccione una opcion\n1: Acceso\n2: Configuracion\n3: Ayuda");
		int seleccion = entrada.nextInt();

		switch (seleccion) {
		case 1:
			System.out.println("Selecccionaste el Acceso");
			break;
		case 2:
			System.out.println("Selecccionaste la Configuracion");
			break;
		case 3:
			System.out.println("Seleccionaste la Ayuda");
			break;
		default:
			System.out.println("Opcion no valida");
			break;
		} 
		entrada.close();

	}

}
