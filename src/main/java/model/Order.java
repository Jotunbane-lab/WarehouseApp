package model;

import javax.persistence.*;
import java.util.List;
@Entity
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
