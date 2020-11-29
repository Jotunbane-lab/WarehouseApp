package JotunbaneLab.WarehouseApp.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StoragePlace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(mappedBy = "storingPlace")
    private List<Product> products;
    private int rackNumber;
    private int level;
    @OneToMany(mappedBy = "storingPlace")
    private List<Order> storedOrders;
}
