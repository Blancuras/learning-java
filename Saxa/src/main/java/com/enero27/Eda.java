package com.enero27;

public class Eda {

	//No es mayo de 18 anios
	//Es menor de 18 anios
	public static void main(String[] args) {
		String txt = "Please locate where 'locate' occurs!";
		System.out.println(txt.indexOf("locate")); // Outputs 7
		txt = txt.substring(txt.indexOf("locate"), 18);
		System.out.println(txt);
	}
	
	private  void admiracion(boolean eda) {
		System.out.println( !eda );
	}
	
	private  void mayorMal(int eda) {
		if ( !( eda >18)  ) { //No es mayo de 18 anios
			System.out.println("No es mayo de eda");
		}else {
			System.out.println("No es menor de eda");
		}
	}
	
	private  void mayorBien(int eda) {
		if (  eda < 18 ) { //Es menor de 18
			System.out.println("Es menor de eda");
		}else {
			System.out.println("Es mayor de eda");
		}
	}
	
	
}
