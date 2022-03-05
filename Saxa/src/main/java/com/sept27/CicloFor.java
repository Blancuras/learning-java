package com.sept27;

public class CicloFor {

	public static void main(String[] args) {
		for (int i = 0; i <= 20; i++) {
			int residuo = i % 3;
			if (residuo == 0) {
				System.out.println("class=blanco");
			}else if(residuo ==1){
				System.out.println("class=azul");
			 }else {
				System.out.println("class=rojo");
			}
			

		}
	}

}
