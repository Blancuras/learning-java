package spring.marzo14Repository;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import spring.marzo14.Category;
import spring.marzo14.Product;

public class ProductRepositoryMockTest {
	@Autowired
	private ProductRepository productRepository;

	public void whenFindByCategory_thenResturnListProduct() {
		Product product01 = new Product();
		Category category = new Category();
		category.setId(1L);

		product01.setDescription("computadora");
		product01.setCategory(category);
		product01.setDescription("");
		product01.setStock(10D);
		product01.setPrice(1240.99);
		product01.setStatus("Created");
		product01.setCreatedAt(new Date());
		productRepository.save(product01);
	}
}
