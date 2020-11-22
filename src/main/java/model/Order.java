package model;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

public class Order {
    private Long id;
    @ManyToOne
    private Long traderId;
    @ManyToOne
    private Long clientId;
    @ManyToOne
    private Long warehouseManId;
    @OneToMany(mappedBy = "orderId")
    private List<Product> productList;
    private String comment;
    @ManyToOne
    private Long storagePlaceId;
    private boolean isDone;

}
