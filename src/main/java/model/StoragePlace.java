package model;

import javax.persistence.OneToMany;
import java.util.List;

public class StoragePlace {
    private Long id;
    @OneToMany(mappedBy = "storagePlaceId")
    private List<Product> products;
    private int rackNumber;
    private int level;
    @OneToMany(mappedBy = "storagePlaceId")
    private List<Order> storedOrders;
}
