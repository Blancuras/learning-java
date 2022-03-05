package com.sept8;
import javax.swing.*; 
public class BucleForEach {

	private static void stringArrayMAnera1() {
		String [] paises=new String[8]; 
		
		paises[0]="Mexico"; 
		paises[1]="España"; 
		paises[2]="Colombia"; 
		paises[3]="Peru"; 
		paises[4]="Chile"; 
		paises[5]="Argentina";
		paises[6]="Ecuador"; 
		paises[7]="Venezuela"; 
		
		for(int i=0;i<8;i++) {
			paises[i]=JOptionPane.showInputDialog("Introduce pais " + (i+1)); 
		}
		for(String elemento: paises) {
			System.out.println("Pais: " + elemento);
		}
	}
	
	private static void stringArrayMAnera2() {
		String[] paises = {"Mexico", "España", "Colombia", "Peru", "Chile", "Argentina","Ecuador", "Venezuela"};
		
		for(int i=0; i<paises.length;i++) {
			System.out.println("Pais " + (i+1) +" " + paises [i]);
		}
		
		for(int i=0;i<8;i++) {
			paises[i]=JOptionPane.showInputDialog("Introduce pais " + (i+1)); 
		}
		for(String elemento: paises) {
			System.out.println("Pais: " + elemento);
		}
	}
	
	private static void stringArrayMAnera3() {
		String [] paises= new String[8]; 
		for(int i=0;i<8;i++) {
			paises[i]=JOptionPane.showInputDialog("Introduce el nombre del pais " + (i+1)); 
		}
		for(String elemento: paises) {// for each 
			System.out.println("Pais: " + elemento);
		}
	}
	
	
	public static void main(String[] args) {
		stringArrayMAnera1();
//		stringArrayMAnera2();
//		stringArrayMAnera3();
	}

}
