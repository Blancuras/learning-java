package com.oct20;

public class Metodos {
//	private static final double PI = 3.1416;

	public static void main(String[] args) {
		//Movie backToTheFuture = new Movie("backToTheFuture", "ciencia Ficcion", 120);
		Movie toyStory = new Movie("Toy Story", "Familiar", 90);
		Movie starWars = new Movie("Star Wars", "Ciencia Ficcion", 180);

		starWars.play();
		starWars.pause();
		toyStory.play();

		int toyStoryTotalFrames = toyStory.getTotalFrames();
		System.out.println("Total frames: " + toyStoryTotalFrames);

		
		
		
		
		
		
		//	backToTheFuture.setDuration(100); 
		// backToTheFuture.setDuration(180);
//	backToTheFuture.setTitle("BackToTheFuture");
//	backToTheFuture.setGender("comedia");

		// System.out.println(backToTheFuture.getTitle() + " " +
		// backToTheFuture.getGender() +" " + backToTheFuture.getDuration());
		// System.out.println(toyStory.getTitle() + " " + toyStory.getGender()+" " +
		// toyStory.getDuration());
		// System.out.println(starWars.getTitle() + " " + starWars.getGender()+" " +
		// starWars.getDuration());

		/*
		 * String[] titleArray = new String[] { "La naranja mecanica",
		 * "Buscando a nemo", "Mision Imposible", "Star Wars", "Troya", "Yo robot",
		 * "Ip Man" }; String title = play(titleArray, 3); String title2 =
		 * play(titleArray); System.out.println(""); pause(title);
		 * System.out.println(""); pause(title2);
		 */
	}
}

/*
 * public static String play(String[] titleArray, int index) { if (index <
 * titleArray.length) {
 * 
 * String title = titleArray[index]; for (int indice = 0; indice < 10; indice++)
 * { System.out.println("Playing movie: " + title); } return title; } else {
 * System.out.println("Index is too big"); return ""; } }
 */
