package JotunbaneLab.WarehouseApp.repository;

import JotunbaneLab.WarehouseApp.model.entity.WarehouseMan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WarehouseManRepository extends JpaRepository<WarehouseMan, Long> {
}
