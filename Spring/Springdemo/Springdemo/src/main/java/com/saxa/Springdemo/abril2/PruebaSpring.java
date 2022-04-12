package com.saxa.Springdemo.abril2;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.saxa.Springdemo.abril2.nombres.NombreEntity;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories
@ComponentScan({ "com" })
public class PruebaSpring {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
		ApplicationContext applicationContext = null;
		try {
			applicationContext = SpringApplication.run(PruebaSpring.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}

		RepositoyUno repositoyUno = applicationContext.getBean(RepositoyUno.class);
		
		List<NombreEntity> nombres = repositoyUno.findAll();
		
		
		// imprimiendo todos los nombres
		for (NombreEntity entity : nombres) {
			System.out.println(entity);
		}

		NombreEntity eliseo = new NombreEntity(); // creamos instancia eliseo
		eliseo.setNombre("Eliseo La"); // asignamos el nombre

		repositoyUno.save(eliseo); // guardamos en base de datos

		NombreEntity encontrado = repositoyUno.findById(15000l).get();
//		repositoyUno.delete(encontrado);
		System.out.println("El encontrado fue " + encontrado);

		repositoyUno.delete(eliseo);
	}

}
