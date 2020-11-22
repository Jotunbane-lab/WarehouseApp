package model;

import java.util.List;

public class Order {
    private Long id;
    private Long traderId;
    private Long clientId;
    private Long warehouseManId;
    private List<Product> productList;
    private String comment;
    private Long storagePlaceId;
    private boolean isDone;

}
