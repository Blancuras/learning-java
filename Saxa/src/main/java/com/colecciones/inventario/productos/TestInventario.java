package com.colecciones.inventario.productos;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.TreeMap;

public class TestInventario {

	public static void main(String[] args) {

		HashMap<String, Integer> inventario = new HashMap<>();
		TreeMap<String, Integer> inventarioOrdenado;

		Scanner entrada = new Scanner(System.in);
//		entrada.useDelimiter("\n"); // useDelimiter elimina el salto de linea

		int opcion = 0;

		System.out.println("Inventario de productos");
		System.out.println("-----------------------");

		while (opcion != 8) {
			System.out.println("\nSeleccione una opcion, por favor");
			System.out.println("1. Añadir producto");
			System.out.println("2. Aumentar stock de un producto");
			System.out.println("3. Eliminar stock de un producto");
			System.out.println("4. Listar productos y su stock");
			System.out.println("5. Eliminar un producto");
			System.out.println("6. Ordenar productos ascendentemente");
			System.out.println("7. Ordenar productos descendentemente");
			System.out.println("8. Salir");

			try {

				System.out.println("Digite una opcion: ");
				opcion = entrada.nextInt();

				String producto;
				int stock, stockActual;

				switch (opcion) {
				case 1:
					System.out.print("\nDigite el nombre del producto: ");
					producto = entrada.next();

					// Si ya existe ese nombre
					if (inventario.containsKey(producto)) {
						System.out.println("No se ha podido añadir el producto, debido a que ya existe ");
					} else {
						inventario.put(producto, 0);
						System.out.println("Se ha añadido el producto");
					}
					break;

				// Aumentar el stock del producto
				case 2:
					System.out.print("\nDigite el nombre del producto: ");
					producto = entrada.next();

					if (inventario.containsKey(producto)) {
						System.out.println("\nDigite la cantidad");
						stock = entrada.nextInt();

						if (stock > 0) {
							stockActual = inventario.get(producto);
							inventario.put(producto, stockActual + stock);
							System.out.println("Se ha añadido " + stock + " de stock ");
						} else {
							System.out.println("No se puede añadir un stock negativo");
						}
					} else {
						System.out.println("No existe el producto");
					}
					break;

				case 3:
					System.out.print("\nDigite el nombre del producto: ");
					producto = entrada.next();

					if (inventario.containsKey(producto)) {
						System.out.println("\nDigite el stock a eliminar: ");
						stock = entrada.nextInt();

						if (stock > 0) {
							stockActual = inventario.get(producto); // estoy obteniendo el valor del mapa
							if (stockActual > stock) {
								inventario.put(producto, stockActual - stock);
							} else {
								System.out.println("No hay suficiente stock a eliminar");
							}
						} else {
							System.out.println("No se puede eliminar un stock negativo ");
						}
					} else {
						System.out.println("No existe el producto ");
					}
					break;

				case 4:
					for (String iterador : inventario.keySet()) {
						stock = inventario.get(iterador);
						System.out.println("");
						System.out.println("Clave: " + iterador);
						System.out.println("Stock: " + stock);
					}
					break;

				case 5:
					System.out.print("\nDigite el nombre del producto a eliminar: ");
					producto = entrada.next();

					if (inventario.containsKey(producto)) {
						inventario.remove(producto);
						System.out.println("Producto eliminado");
					} else {
						System.out.println("No existe el producto");
					}
					break;

				case 6:
					inventarioOrdenado = new TreeMap<>(new OrdenacionProductosAscendentemente());
					inventarioOrdenado.putAll(inventario);

					for (String iterador : inventarioOrdenado.keySet()) {
						stock = inventarioOrdenado.get(iterador);
						System.out.println("");
						System.out.println("Clave: " + iterador);
						System.out.println("Stock: " + stock);
					}
					break;

				case 7:
					inventarioOrdenado = new TreeMap<>(new OrdenacionProductosDescendentemente());
					inventarioOrdenado.putAll(inventario);

					for (String iterador : inventarioOrdenado.keySet()) {
						stock = inventarioOrdenado.get(iterador);
						System.out.println("");
						System.out.println("Clave: " + iterador);
						System.out.println("Stock: " + stock);
					}
					break;

				case 8:
					System.out.println("Gracias por participar :)");
					opcion = 8;
					break;

				default:
					System.out.println("");
					System.out.println("Vuelva a intentar, esa opcion no esta disponible ");
					break;
				}

			} catch (InputMismatchException excepcion) {
				System.out.println("");
				excepcion.printStackTrace();
				System.out.println("Vuelva a intentar, solo se permiten numeros");
				entrada.next();
				}
			} 

		}

}
