package JotunbaneLab.WarehouseApp.repository;

import JotunbaneLab.WarehouseApp.model.Trader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TraderRepository extends JpaRepository<Trader,Long> {
}
