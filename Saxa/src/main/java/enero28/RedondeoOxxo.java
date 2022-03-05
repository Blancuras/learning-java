package enero28;

import java.util.Scanner;

//Realizar un programa que calcule la venta de 3 productos del OXXO y al final donar x
//centavos(Redondear)
public class RedondeoOxxo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese Valor del producto 1: ");
		float producto1 = entrada.nextFloat();
		System.out.print("Ingrese Valor del producto 2: ");
		float producto2 = entrada.nextFloat();
		System.out.print("Ingrese Valor del producto 3: ");
		float producto3 = entrada.nextFloat();
		float suma = producto1 + producto2 + producto3;
		System.out.println("Suma total = " + suma);
		double totalMasRedondeo = Math.ceil(suma);
		System.out.println("Total pagado: " + totalMasRedondeo);
		double redondeo = totalMasRedondeo - suma;
		System.out.println("Gracias por redondear: " + redondeo);
		entrada.close();
	}
}
