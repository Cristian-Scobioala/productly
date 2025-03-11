package gr.eshop.productly.repository;

import gr.eshop.productly.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
