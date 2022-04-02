package spring.marzo19.estudiantes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudienteRepository extends JpaRepository<EstudianteEntity, Long> {

}
