package feb2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MetodoBurbuja {

	public static void main(String[] args) {
		List<String> letras = new ArrayList<>();
		letras.add("casa");
		letras.add("carro");
		letras.add("perro");
		letras.add("zanahoria");
		letras.add("orejas");
		letras.add("blanco");
		letras.add("lapiz");
		letras.add("libreta");
		letras.add("salon");
		letras.add("color");
		letras.add("bocina");
		
		Collections.sort(letras);
		
		for (String letra : letras) {
			System.out.println("palabra "+letra);
		}
	}

}
