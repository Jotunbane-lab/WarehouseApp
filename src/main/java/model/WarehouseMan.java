package model;

import javax.persistence.OneToMany;
import java.util.List;


public class WarehouseMan {
    private Long id;
    private String name;
    @OneToMany(mappedBy = "warehouseManId")
    private List<Order> orderList;

}
