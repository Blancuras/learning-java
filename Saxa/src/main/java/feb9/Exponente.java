package feb9;
import java.util.Scanner;

public class Exponente {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int base;
		int exponente;

		System.out.println("Digite la base: ");
		base = entrada.nextInt();

		System.out.println("Digite el exponente: ");
		exponente = entrada.nextInt();

		int resultado = (int) Math.pow(base, exponente);
		System.out.println("El numero " + base + " elevado al exponente " + " es : " + resultado);

	}

}
