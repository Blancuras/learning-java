package spring.marzo12;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Service;

@Service
public class FechaService {

	public String fechaConFormato() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		String fechaConFormato = dtf.format(LocalDateTime.now());
		return fechaConFormato;
	} 
	
	public String fechaSinFormato() {
		return LocalDateTime.now().toString();
	}
}
