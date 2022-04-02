package spring.marzo19.productos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/19-marzo-b")
public class ProductosController {

	@Autowired
	private ProductosService productosService;

	@PostMapping("/crear")
	public ResponseEntity<ProductoEntity> crear(@RequestBody ProductoEntity productoEntity) {
		productoEntity = productosService.crear(productoEntity);
		return new ResponseEntity<>(productoEntity, HttpStatus.CREATED);
	}

	@GetMapping("/obtener")
	public ResponseEntity<List<ProductoEntity>> getProductos() {
		List<ProductoEntity> productos = productosService.obtener();
		return new ResponseEntity<>(productos, HttpStatus.OK);
	}

	@PutMapping("/actualizar")
	public ResponseEntity<ProductoEntity> actualizar(@RequestBody ProductoEntity productoEntity) {
		productoEntity = productosService.actualizar(productoEntity);
		return new ResponseEntity<>(productoEntity, HttpStatus.OK);
	}

	@DeleteMapping("/borrar/{id}")
	public ResponseEntity<String> borrar(@PathVariable(value = "id") Long id) {
		String borrar = productosService.borrar(id);
		return new ResponseEntity<>(borrar, HttpStatus.OK);
	}

	@GetMapping("/buscar/{nombre}")
	public ResponseEntity< List<ProductoEntity> > buscar(@PathVariable(value = "nombre") String nombre){
		List<ProductoEntity> buscar = productosService.buscarPorNombre(nombre);
		return new ResponseEntity<List<ProductoEntity>>(buscar, HttpStatus.OK);
	}
	
	public static void main(String[] args) {
//		ProductoEntity prod = new ProductoEntity(null, 0)
	}
}
