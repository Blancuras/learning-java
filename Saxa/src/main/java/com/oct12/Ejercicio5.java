package com.oct12;

import javax.swing.JOptionPane;

/*
 * Una empresa que se dedia a la venta de desinfectantes necesita un programa para gestionar
 * las facturas. En cada factura figura: el codigo del articulo, la cantidad vendida en litros 
 * y el precio por litro. Se pide de 5 facturas introducidas: Facturacion total, cantidad en 
 * litros vendidos del articulo 1 y cuantas facturas se emitieron de mas de $600
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		int codigo, litros, litrosArticulo1= 0, conteoMas600 = 0;
		float precioLitro, importeFactura, facturacionTotal = 0;
		System.out.println("Llena los 5 productos");
		for (int indice = 1; indice <= 5; indice++) {
			codigo = Integer.parseInt(JOptionPane.showInputDialog("Articulo N. " + indice + "\nDigite el codigo: "));
			litros = Integer.parseInt(JOptionPane.showInputDialog("Articulo N. " + indice + "\nDigite la cantidad vendida en litros: "));
			precioLitro = Float.parseFloat(JOptionPane.showInputDialog("Articulo N. " + indice + "\nDigite el precio por litro: "));
			
			importeFactura = (float) litros * precioLitro; //importe por factura
			facturacionTotal += importeFactura; //suma iterativa de las facturas 
			
			if(codigo == 1) {
				 litrosArticulo1 += litros; 
			} 
			if(importeFactura > 600) {
				conteoMas600++; 
			}
		} 
		System.out.println("Resumen de Ventas");
		System.out.println("Facturacion Total: " + facturacionTotal); 
		System.out.println("Cantidad en litros vendidos del articulo 1: " + litrosArticulo1); 
		System.out.println("Cantidad de facturas mayores a $600: " + conteoMas600);
	}

}
