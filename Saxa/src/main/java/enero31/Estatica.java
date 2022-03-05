package enero31;

import java.time.LocalDateTime;

public class Estatica {
	public String normal = LocalDateTime.now().toString(); 
	public static String estatic = LocalDateTime.now().toString();
}
