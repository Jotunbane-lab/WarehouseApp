package model;

import javax.persistence.ManyToOne;

public class Product {
    private Long id;
    private String productName;
    private int weight;
    @ManyToOne
    private Long storagePlaceId;
    private boolean isReserved;

    @ManyToOne
    private long orderId;
}
