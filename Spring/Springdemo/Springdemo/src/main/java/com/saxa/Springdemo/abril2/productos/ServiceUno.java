package com.saxa.springdemo.abril2.productos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saxa.springdemo.abril2.nombres.NombreEntity;

@Service
public class ServiceUno {

	@Autowired
	private RepositoyUno repositoryUno;
	
	//hola soy put 2022-04-02 12:17:30
	//hola soy post 2022-04-02 12:17:13
	//Hola soy delete 2022-04-02 12:14:11
	public String generarSaludo(String metodoHttp) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss");
		String resultado = LocalDateTime.now().format(dtf);
		String tomorrow = LocalDateTime.now().plusDays(1).format(dtf);
		String yesterday = LocalDateTime.now().minusDays(1).format(dtf);
		System.out.println(" valor "+metodoHttp);
		 String hola = "hola soy " + metodoHttp + " "+  resultado + " y mañana sera " + tomorrow 
				 + " y  ayer fue " + yesterday;
		 
		 return hola;
	}
	
	public List<NombreEntity> obtenerNombres(){
		return repositoryUno.findAll();
	}
	
	public NombreEntity obtenerNombre() {
		return repositoryUno.findById(15000l).get(); 
	}
	
	public NombreEntity guardarNombre(NombreEntity nombreEntity) {
		return repositoryUno.save(nombreEntity);
	} 
	
	public void borrarNombre(NombreEntity nombreEntity) {
		repositoryUno.delete(nombreEntity);
	}
}
