package com.oct5;

import java.util.ArrayList;
import java.util.List;

public class Breka {

	public static void main(String[] args) {
		List<String> pares = new ArrayList<>();
		pares.add("XRP-BTC");
		pares.add("XRP-DOGE");
		pares.add("XRP-MANA");
		pares.add("MANA-LTC");
		pares.add("LTC-BTC");
		pares.add("MOLLY-BTC");
		pares.add("XRP-CHUCHITA");
		pares.add("CASA-BTC");
		pares.add("XRP-FLOR");
		pares.add("NEGRO-BTC");
		pares.add("XRP-BLANCURAS");

		for (String par : pares) {
			if (par.contains("XRP")) {
//				continue; // se lo salta
//				break;//Termina el for
			}
			System.out.println(par);
		}
	}
}
