package spring.marzo14Repository;

import java.util.List;
import java.util.Locale.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.marzo14.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	public List<Product> findByCategory(Category category);

}
