package model;

import javax.persistence.*;
import java.util.List;
@Entity
public class Trader {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "traderId")
    private List<Order> orderList;
    @OneToMany(mappedBy = "hisTrader")
    private List<Client> clients;
}
