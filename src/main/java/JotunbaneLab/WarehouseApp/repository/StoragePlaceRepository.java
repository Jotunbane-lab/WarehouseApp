package JotunbaneLab.WarehouseApp.repository;

import JotunbaneLab.WarehouseApp.model.StoragePlace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoragePlaceRepository extends JpaRepository<StoragePlace,Long> {
}
