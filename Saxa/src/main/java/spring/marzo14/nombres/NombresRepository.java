package spring.marzo14.nombres;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //Permite guardar en la base de datos
public interface NombresRepository extends JpaRepository<NombreEntity, Long>  {

}


