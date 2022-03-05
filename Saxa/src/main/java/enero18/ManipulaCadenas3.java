package enero18;

public class ManipulaCadenas3 {

	public static void main(String[] args) {
		String alumno1, alumno2; 
		
		alumno1 = "     David "; 
		alumno2 = "   david   "; 
		
		System.out.println(alumno1.trim().equalsIgnoreCase(alumno2.trim()));
	}

}
