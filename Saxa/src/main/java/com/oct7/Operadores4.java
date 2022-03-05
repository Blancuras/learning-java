package com.oct7;

import java.util.Scanner;

/*La calificacion final de un estudiante de informatica se calcula con base a las calificaciones
 *de cuatro aspectos de su rendimiento academico: participacion, primer examen parcial, segundo 
 *examen parcial y examen final. Sabiendo que las calificaciones ateriores entran a la calificacion
 *final con ponderaciones del 10%, 25%, 25%, 40%, Hacer un programa que calcule e imprima la 
 *calificacion final obtenida por un estudiante. 
 */
public class Operadores4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		float participacion, primerExamen, segundoExamen, examenFinal, notaFinal; 
		
		//pedir los datos necesarios
		System.out.println("Digita la nota de participacion"); 
		participacion = entrada.nextFloat(); 
		System.out.println("Digita la nota del primer examen parcial"); 
		primerExamen = entrada.nextFloat(); 
		System.out.println("Digita la nota del segundo examen parcial");
		segundoExamen = entrada.nextFloat();  
		System.out.println("Digita la nota de examen final"); 
		examenFinal = entrada.nextFloat(); 
		entrada.close();
		
		participacion = participacion * 0.10f; 
		primerExamen =primerExamen * 0.25f; 
		segundoExamen =segundoExamen * 0.25f; 
		examenFinal = examenFinal *  0.40f; 
		
		//sumamos las notas
		notaFinal = participacion + primerExamen + segundoExamen + examenFinal; 
		//Imprimir el resultado en pantalla
		System.out.println("La nota final es " + notaFinal);
	}

}
