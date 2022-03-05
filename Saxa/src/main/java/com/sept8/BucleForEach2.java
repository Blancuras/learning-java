package com.sept8; 
import javax.swing.*;

public class BucleForEach2 {

	public static void main(String[] args) {
		
		int[] arraysAleatorios=new int[150]; 
		for(int i=0; i<arraysAleatorios.length;i++) {
			arraysAleatorios[i]=(int)Math.round(Math.random() *100); 
		} 
		
		for(int numeros: arraysAleatorios) {
			System.out.print(numeros + " ");
		}
	}

}
