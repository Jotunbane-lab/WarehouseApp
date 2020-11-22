package model;

import javax.persistence.*;
import java.util.List;
@Entity
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
