package model;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productName;
    private int weight;
    @ManyToOne
    private StoragePlace storingPlace;
    private boolean isReserved;

    @ManyToOne
    private Order order;
}
