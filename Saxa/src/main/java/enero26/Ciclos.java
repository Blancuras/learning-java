package enero26;

public class Ciclos {

	public static void main(String[] args) {
		int indice = 0;

		System.out.println("Serie con for ");
		for (indice = 1; indice <= 10; indice++) {
			if (indice < 10) {
				System.out.print(indice + ",");
			} else {
				System.out.println(indice);
			} 
		}
		
		indice = 1; 
		System.out.println("");
			System.out.println("Serie con while");
			while (indice <= 10) {
				if (indice < 10) {
					System.out.print(indice + ",");
				} else {
					System.out.print(indice);
				}
				indice++;
			}
			indice = 1;
			System.out.println("");

			System.out.println("Serie do-while");
			do {
				if (indice < 10) {
					System.out.print(indice + " , ");
				} else {
					System.out.print(indice);
				}
				indice++;
			} while (indice <= 10);

		}
	}

