package spring.marzo19.productos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductosService {

	@Autowired
	private ProductosRepository repository;

	public ProductoEntity crear(ProductoEntity productoEntity) {
		return repository.save(productoEntity);
	}

	public List<ProductoEntity> obtener() {
		return repository.findAll();
	}

	public ProductoEntity actualizar(ProductoEntity productoEntity) {
		ProductoEntity encontrado = repository.findById(productoEntity.getId()).get();
		encontrado.setNombre(productoEntity.getNombre());
		encontrado.setPrecio(productoEntity.getPrecio());
		encontrado = repository.save(encontrado);
		return encontrado;
	}

	public String borrar(Long id) {
		repository.deleteById(id);
		return "Se ha borrao tio";
	}
	
	 public List<ProductoEntity> buscarPorNombre(String nombre) {
		return repository.findAllByNombre(nombre);
	 }
}
