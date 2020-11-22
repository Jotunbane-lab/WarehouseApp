package model;

import javax.persistence.*;
import java.util.List;

@Entity
public class WarehouseMan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "warehouseMan")
    private List<Order> orderList;

}
