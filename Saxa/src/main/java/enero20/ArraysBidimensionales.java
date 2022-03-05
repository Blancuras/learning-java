package enero20;

public class ArraysBidimensionales {

	public static void main(String[] args) {
		int [][] arreglo = {
				{10, 15, 18, 19, 21},
				{5, 25, 37, 41, 15},
				{7, 19, 32, 14, 90},
				{85, 2, 17, 40, 27}
		};
		
		for (int []fila: arreglo) {
			System.out.println();
			for(int z: fila) {
				System.out.print(z + " "); 
				
			}
		}
		
	}

}
