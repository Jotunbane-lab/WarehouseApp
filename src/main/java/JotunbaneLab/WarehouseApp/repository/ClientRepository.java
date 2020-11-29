package JotunbaneLab.WarehouseApp.repository;

import JotunbaneLab.WarehouseApp.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {
}
