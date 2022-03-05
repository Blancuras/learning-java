package com.sept30;

public class JavaMath {

	public static void main(String[] args) {
		int max = Math.max(1, 6); 
		int max2 = Math.max(max, 5); 
		int min = Math.min(5, 40); 
		int positivo = Math.abs(-52);  
		double random = Math.random(); 
		int randomNum = (int)(Math.random() * 100);  // 0 to 101 CAST
		System.out.println("Random2 " + randomNum);
		System.out.println("Random " + random);
		System.out.println("Positivo " + positivo);
		System.out.println("Max " + max2);
		System.out.println("Min " + min);
	}

}
