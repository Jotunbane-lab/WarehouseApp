package JotunbaneLab.WarehouseApp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Trader trader;
    @ManyToOne
    private Client client;
    @ManyToOne
    private WarehouseMan warehouseMan;
    @OneToMany(mappedBy = "order")
    private List<Product> productList;
    private String comment;
    @ManyToOne
    private StoragePlace storingPlace;
    private boolean isDone;

}
