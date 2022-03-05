package com.oct6;

public class Metodo {

	public static void main(String[] args) throws InterruptedException {
		String[] titleArray = new String[] { "La naranja mecanica", "Buscando a Nemo", "Mision Imposible", "Star Wars", "Troya", "Yo Robot", "Ip Man" };
		String title = play(titleArray, 3);//Error indice grande
//		play(titleArray, 1);
		System.out.println("");
		pause(title);
	}

	public static String play(String[] titleArray, int index) throws InterruptedException {
		if (index > titleArray.length) {//validacion
			System.out.println("Index is too big "+index);
			Thread.sleep(2000);
			return "";
		}
		
		String title = titleArray[index];
		for (int indice = 0; indice <= 3; indice++) {
			System.out.println("Playing movie..." + title);
			Thread.sleep(2000);
		}
		Thread.sleep(2000);
		return title; 
	}

	public static void pause(String title) {
		System.out.println("Movie paused: " + title);
	}
	
	public static void mihail() {
		System.out.println("hola mija");
	}
}