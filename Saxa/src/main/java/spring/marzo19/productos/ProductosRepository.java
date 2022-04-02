package spring.marzo19.productos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductosRepository extends JpaRepository<ProductoEntity, Long>{
	
	
	public List<ProductoEntity> findAllByNombre(String nombre);
}
