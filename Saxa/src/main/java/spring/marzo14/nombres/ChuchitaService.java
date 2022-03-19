package spring.marzo14.nombres;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class ChuchitaService {
	private String hora;
	
	//constructor
	public ChuchitaService() {
		hora = LocalDateTime.now().toString();
	} 
	
	public void horaChuchita() {
		System.out.println("Hora Chuchita " + hora +" "+LocalDateTime.now().toString());
	}
}
