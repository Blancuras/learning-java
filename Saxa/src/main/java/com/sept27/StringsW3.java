package com.sept27;

public class StringsW3 {
	public static void main(String[] args) {
		tamanio(); 
		 minusculasMinusculas();  
		 locate(); 
		 escapeString();
	} 
	private static void tamanio() {
		String letra = "A"; 
		System.out.println("Tamanio " + letra.length());
		System.out.println("Elemento en la posicion 0 " + letra.charAt(0)); 
	}
	
	private static void minusculasMinusculas() {
		String hello = "Hola Mundo"; 
		hello = hello.toUpperCase();
		System.out.println(hello.toLowerCase()); 
		System.out.println("original "+hello);
		System.out.println(hello.toUpperCase());
		System.out.println("original "+hello);

	}
	
	private static void locate() {
		String hello = "Hola Mundo"; 
		System.out.println(hello.indexOf("Hola")); //0
		System.out.println(hello.indexOf("Mundo")); //5 
		System.out.println(hello.indexOf("Eliseo")); //-1
		System.out.println(hello.contains("mundo"));
	}
	private static void escapeString() {
		String txt = "\tWe are the so-called \n\t\"Vikings\"  's \n\tfrom the north.  \"Eliseo\""; 
		System.out.println(txt);
		String greeting = "Hola"; 
		
	}
}
