package model;

import javax.persistence.OneToMany;
import java.util.List;

public class Trader {
    private Long id;
    private String name;
    @OneToMany(mappedBy = "traderId")
    private List<Order> orderList;
    @OneToMany(mappedBy = "hisTraderId")
    private List<Client> clients;
}
