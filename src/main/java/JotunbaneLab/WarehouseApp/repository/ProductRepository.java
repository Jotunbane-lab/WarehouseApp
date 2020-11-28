package JotunbaneLab.WarehouseApp.repository;

import JotunbaneLab.WarehouseApp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
